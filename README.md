Listar todos:
http://localhost:8080/PersonaRest/rest/personas/todos

Buscar por cédula:
http://localhost:8080/PersonaRest/rest/personas/cedula/1712345678

Verificar si aplica a crédito (Lógica de negocio):
http://localhost:8080/PersonaRest/rest/personas/credito/1712345678

Agregar un usuario:
{
  "id": 3,
  "nombre": "Carla Perez",
  "cedula": "1712345699",
  "edad": 40
}

Actualizar usuario:
{
  "id": 3,
  "nombre": "Carla Borja",
  "cedula": "1712345612",
  "edad": 50
}

Borrar:
http://localhost:8080/PersonaRest/rest/personas/1
Se borra pasando el id del registro, en este caso el 1
