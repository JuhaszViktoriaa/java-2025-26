import sqlite3
from fastapi import FastAPI
from pydantic import BaseModel

class Flower(BaseModel):
    id: int
    nev: str
    kategoriaId: int
    leiras: str
    keszlet: int
    ar: int
    kepUrl: str

class PutFlower(BaseModel):
    nev: str
    leiras: str
    ar: int
    keszlet: int
app = FastAPI()
connection = sqlite3.connect("viragbolt.db")

#pip install --upgrade --force-reinstall uvicorn

@app.get("/flowers")
async def root():
    response = []

    cursor = connection.cursor()
    cursor.execute("SELECT aruk.id, aruk.nev, kategoriak.id, kategoriak.nev, aruk.leiras, aruk.keszlet, aruk.ar, aruk.kepUrl FROM aruk INNER JOIN kategoriak ON aruk.kategoriaId = kategoriak.id")

    for row in cursor.fetchall():
        print(row)

        item = {
            "id": row[0],
            "nev": row[1],
            "kategoria": {
                "id": row[2],
                "nev": row[3]
            },
            "leiras": row[4],
            "keszlet": row[5],
            "ar": row[6],
            "kepUrl": row[7]
        }
        response.append(item)
    return response

@app.get("/api/flowers/{id}", status_code=201)
async def flowers_get(id: int):
    cursor = connection.cursor()
    cursor.execute("SELECT aruk.id, aruk.nev, kategoriak.id, kategoriak.nev, aruk.leiras, aruk.keszlet, "
                   "aruk.ar, aruk.kepUrl FROM aruk INNER JOIN kategoriak ON aruk.kategoriaId = kategoriak.id WHERE aruk.id = ?", [id])
    response = None
    row = cursor.fetchone()
    response = {
        "id": row[0],
        "nev": row[1],
        "kategoria": {
            "id": row[2],
            "nev": row[3]
        },
        "leiras": row[4],
        "keszlet": row[5],
        "ar": row[6],
        "kepUrl": row[7]
    }
    return response

@app.post("/api/flowers", status_code=201)
async def flowers_post(flower: Flower):
    cursor = connection.cursor()
    cursor.execute("INSERT INTO aruk (id, nev, kategoriaId, leiras, keszlet, ar, kepUrl) VALUES (?, ?, ?, ?, ?, ?, ?)",
                   [flower.id, flower.nev, flower.kategoriaId, flower.leiras, flower.keszlet, flower.ar, flower.kepUrl])
    return {"virag":"adatok"}

@app.put("/api/flowers/{id}", status_code=201)
async def flowers_put(flower: PutFlower, id: int):
    cursor = connection.cursor()
    cursor.execute("UPDATE aruk SET nev = ?, leiras = ?, ar = ?, keszlet = ? WHERE id = ?",
                   [flower.nev, flower.leiras, flower.ar, flower.keszlet, id])
    return {"response":"a virag adatai frissitesre kerultek!"}

@app.delete("/api/flowers/{id}", status_code=404)
async def flowers_delete(id: int):
    cursor = connection.cursor()
    cursor.execute("DELETE FROM aruk WHERE id = ?", [id])
    return {"response": "a virag sikeresen torlesre kerult!"}

@app.get("/api/categories", status_code=200)
async def categories_get():
    cursor = connection.cursor()
    cursor.execute("SELECT * FROM kategoriak" )

    response = []

    for sor in cursor.fetchall():
        item = {
            "id": sor[0],
            "nev": sor[1]
        }
        response.append(item)
    return response