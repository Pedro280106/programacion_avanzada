--Create y select de tabla ctl_contenido
CREATE TABLE IF NOT EXISTS ctl_contenidos
(
	idu_contenido serial,
	des_sinopsis varchar(500) DEFAULT '',
	fec_lanzamiento date DEFAULT '1900-01-01',
	hrs_duracion time DEFAULT '00:00:00',
	img_portada varchar(2000) DEFAULT '',
	PRIMARY KEY (idu_contenido)
);

SELECT * FROM ctl_contenidos;

--Create y select de tabla ctl_multimedias
CREATE TABLE IF NOT EXISTS ctl_multimedias
(
	idu_multimedia serial,
	nom_titulo varchar(150) DEFAULT '',
	idu_genero int DEFAULT 0,
	idu_clasificacion int DEFAULT 0,
	idu_estudio int DEFAULT 0,
	idu_contenido int DEFAULT 0,
	PRIMARY KEY (idu_multimedia)
);

SELECT * FROM ctl_multimedias