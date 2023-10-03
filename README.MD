# Microservicio Gestión de Cursos

## Descripción

Este sistema proporciona una API RESTful para la gestión de cursos. Permite la realización de operaciones CRUD sobre la entidad `Curso`, así como recuperación y filtrado de datos basados en parámetros específicos, utilizando una arquitectura de microservicio.

## Tecnologías Utilizadas

- Java
- Spring Boot
- MySQL

## Funcionalidades

- **Recuperar todos los cursos:** Retorna una lista con todos los cursos existentes.
- **Buscar curso por código:** Retorna la información de un curso específico basándose en su código.
- **Crear un nuevo curso:** Permite añadir un nuevo curso al sistema.
- **Eliminar un curso:** Permite borrar un curso basado en su código.
- **Actualizar la duración de un curso:** Permite modificar la duración de un curso específico.
- **Filtrar cursos por rango de precio:** Permite obtener una lista de cursos cuyo precio esté dentro de un rango especificado.

## Instalación y Configuración

-   Si fuera necesario, crear base de datos con la sentencia SQL documentada en el archivo create.sql dentro de la carpeta META-INF

### Pasos

1. **Clone del Repositorio**
   ```
   git clone https://github.com/jmrm92/cursos_ejercicio1
   ```
   
2. **Base de Datos**
    - Instale y configure MySQL.
    - Cree una base de datos y configure las credenciales en el archivo `application.properties`.
   
3. **Build y Ejecución con Maven**
   ```
   mvn clean install
   mvn spring-boot:run
   ```
   
   La API debería estar disponible en `http://localhost:8080`.

## API Endpoints

### Cursos

- **Obtener todos los cursos**
    - Método: `GET`
    - Endpoint: `/`

- **Obtener un curso por código**
    - Método: `GET`
    - Endpoint: `/{codCurso}`

- **Crear un nuevo curso**
    - Método: `POST`
    - Endpoint: `/`
        
- **Eliminar un curso**
    - Método: `DELETE`
    - Endpoint: `/{codCurso}`
        
- **Actualizar la duración de un curso**
    - Método: `PUT`
    - Endpoint: `/{codCurso}/{duracion}`
        
- **Filtrar cursos por rango de precio**
    - Método: `GET`
    - Endpoint: `/{precioMinimo}/{precioMaximo}`
