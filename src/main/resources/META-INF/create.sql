CREATE TABLE cursosdb2.cursos (
	cod_curso INT NOT NULL AUTO_INCREMENT,
	nombre varchar(100) NOT NULL,
	duracion INT NOT NULL,
	precio double NOT NULL,
	CONSTRAINT cursos_pk PRIMARY KEY (codCurso)
)