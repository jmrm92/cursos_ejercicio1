CREATE TABLE cursosdb2.cursos (
	cod_curso INT NOT NULL,
	nombre varchar(100) NOT NULL,
	duracion INT NOT NULL,
	precio INT NOT NULL,
	CONSTRAINT cursos_pk PRIMARY KEY (codCurso)
)