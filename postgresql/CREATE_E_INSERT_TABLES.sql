DROP TABLE IF EXISTS cat_generos;
DROP TABLE IF EXISTS cat_estudios;
DROP TABLE IF EXISTS cat_tipos;
DROP TABLE IF EXISTS cat_clasificaciones;

-- Create, insert y select de tabla cat_generos
CREATE TABLE IF NOT EXISTS cat_generos 
(
	idu_genero serial,
	nom_genero varchar(50) default '',
	PRIMARY KEY (idu_genero)
);

INSERT INTO cat_generos(nom_genero)
VALUES ('Acción'),
       ('Aventura'),
       ('Comedia'),
       ('Drama'),
       ('Ciencia ficción'),
       ('Fantasía'),
       ('Terror'),
       ('Suspense'),
       ('Romance'),
       ('Animación'),
       ('Documental');

--SELECT * FROM cat_generos;

-- Create, insert y select de tabla cat_estudios
CREATE TABLE IF NOT EXISTS cat_estudios
(
	idu_estudio serial,
	nom_estudio varchar(70) default '',
	PRIMARY KEY (idu_estudio)
);

INSERT INTO cat_estudios (nom_estudio)
VALUES ('Walt Disney Pictures'),
       ('Warner Bros. Pictures'),
       ('Universal Pictures'),
       ('20th Century Studios'),
       ('Paramount Pictures'),
       ('Sony Pictures Entertainment'),
       ('Lionsgate Films'),
       ('Metro-Goldwyn-Mayer (MGM)'),
       ('DreamWorks Pictures'),
       ('Pixar Animation Studios');
	   
-- SELECT * FROM cat_estudios;

-- Create, insert y select de tabla cat_tipos
CREATE TABLE IF NOT EXISTS cat_tipos
(
	idu_tipo serial,
	des_tipo varchar(30) DEFAULT '',
	PRIMARY KEY (idu_tipo)
);

INSERT INTO cat_tipos (des_tipo)
VALUES ('Pelicula'), ('Serie');

-- SELECT * FROM cat_tipos;

-- Create, insert y select de tabla cat_clasificaciones
CREATE TABLE IF NOT EXISTS cat_clasificaciones (
	idu_clasificacion serial,
	nom_clasificacion varchar(50) DEFAULT '',
	des_clasificacion varchar(255) DEFAULT '',
	idu_tipo int default 0,
	PRIMARY KEY (idu_clasificacion)
);

INSERT INTO cat_clasificaciones (nom_clasificacion, des_clasificacion, idu_tipo)
VALUES ('PG', 'Apta para todos los públicos',1),
       ('PG-13', 'Se recomienda la guía de los padres para menores de 13 años',1),
       ('R', 'Restringido; se requiere la compañía de un adulto para menores de 17 años',1),
       ('NC-17', 'No apta para menores de 17 años',1),
	   ('TV-Y', 'Apta para todos los niños',2),
       ('TV-Y7', 'Apta para niños mayores de 7 años',2),
       ('TV-G', 'Apta para todos los públicos',2),
       ('TV-PG', 'Se recomienda la guía de los padres',2);

-- SELECT * FROM cat_clasificaciones;

-- Create y select de tabla ctl_contenidos
CREATE TABLE IF NOT EXISTS ctl_contenidos
(
	idu_contenido serial,
	des_sinopsis varchar(500) default '',
	fec_lanzamiento date default '1900-01-01',
	hrs_duracion time default '00:00:00',
	img_portada varchar(2000) default '',
	PRIMARY KEY (idu_contenido)
);

-- SELECT * FROM ctl_contenidos;

-- Create y select de tabla ctl_multimedias
CREATE TABLE IF NOT EXISTS ctl_multimedias
(
	idu_multimedia serial,
	nom_titulo varchar(150) default '',
	idu_genero int default 0,
	idu_clasificacion int default 0,
	idu_estudio int default 0,
	idu_contenido int default 0,
	PRIMARY KEY (idu_multimedia)
);

SELECT * FROM ctl_multimedias;