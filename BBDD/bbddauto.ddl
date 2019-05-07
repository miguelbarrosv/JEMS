-- Generado por Oracle SQL Developer Data Modeler 19.1.0.081.0911
--   en:        2019-05-07 11:52:10 CEST
--   sitio:      Oracle Database 12c
--   tipo:      Oracle Database 12c



CREATE TABLE administrador (
    codigo_administrador   INTEGER NOT NULL,
    usuario                VARCHAR2 
--  ERROR: VARCHAR2 size not specified 
     NOT NULL,
    contraseña             VARCHAR2 
--  ERROR: VARCHAR2 size not specified 
     NOT NULL
);

ALTER TABLE administrador ADD CONSTRAINT administrador_pk PRIMARY KEY ( codigo_administrador );

CREATE TABLE dueño (
    codigo_dueño     INTEGER NOT NULL,
    nombre_dueño     VARCHAR2 
--  ERROR: VARCHAR2 size not specified 
     NOT NULL,
    apellido_dueño   VARCHAR2 
--  ERROR: VARCHAR2 size not specified 
     NOT NULL
);

ALTER TABLE dueño ADD CONSTRAINT dueño_pk PRIMARY KEY ( codigo_dueño );

CREATE TABLE equipo (
    codigo_equipo        INTEGER NOT NULL,
    nombre_equipo        VARCHAR2 
--  ERROR: VARCHAR2 size not specified 
     NOT NULL,
    presupuesto          INTEGER NOT NULL,
    localidad            VARCHAR2 
--  ERROR: VARCHAR2 size not specified 
     NOT NULL,
    dueño_codigo_dueño   INTEGER NOT NULL
);

ALTER TABLE equipo ADD CONSTRAINT equipo_pk PRIMARY KEY ( codigo_equipo );

CREATE TABLE jornada (
    codigo_jornada   INTEGER NOT NULL,
    fecha            DATE NOT NULL
);

ALTER TABLE jornada ADD CONSTRAINT jornada_pk PRIMARY KEY ( codigo_jornada );

CREATE TABLE jugador (
    codigo_jugador         INTEGER NOT NULL,
    nombre_jugador         VARCHAR2 
--  ERROR: VARCHAR2 size not specified 
     NOT NULL,
    apellido_jugador       VARCHAR2 
--  ERROR: VARCHAR2 size not specified 
     NOT NULL,
    nickname               VARCHAR2 
--  ERROR: VARCHAR2 size not specified 
     NOT NULL,
    sueldo                 INTEGER NOT NULL,
    nacionalidad           VARCHAR2 
--  ERROR: VARCHAR2 size not specified 
     NOT NULL,
    estado                 VARCHAR2 
--  ERROR: VARCHAR2 size not specified 
     NOT NULL,
    equipo_codigo_equipo   INTEGER NOT NULL
);

ALTER TABLE jugador ADD CONSTRAINT jugador_pk PRIMARY KEY ( codigo_jugador );

CREATE TABLE liga (
    codigo_liga INTEGER NOT NULL
);

ALTER TABLE liga ADD CONSTRAINT liga_pk PRIMARY KEY ( codigo_liga );

CREATE TABLE participar (
    equipo_codigo_equipo     INTEGER NOT NULL,
    jornada_codigo_jornada   INTEGER NOT NULL
);

ALTER TABLE participar ADD CONSTRAINT participar_pk PRIMARY KEY ( equipo_codigo_equipo,
                                                                  jornada_codigo_jornada );

CREATE TABLE partido (
    codigo_partido               INTEGER NOT NULL,
    equipoa                      VARCHAR2 
--  ERROR: VARCHAR2 size not specified 
     NOT NULL,
    equipob                      VARCHAR2 
--  ERROR: VARCHAR2 size not specified 
     NOT NULL,
    jornada_codigo_jornada       INTEGER NOT NULL,
    resultado_codigo_resultado   INTEGER NOT NULL
);

CREATE UNIQUE INDEX partido__idx ON
    partido (
        resultado_codigo_resultado
    ASC );

ALTER TABLE partido ADD CONSTRAINT partido_pk PRIMARY KEY ( codigo_partido );

CREATE TABLE resultado (
    codigo_resultado         INTEGER NOT NULL,
    puntuacion               INTEGER NOT NULL,
    partido_codigo_partido   INTEGER NOT NULL,
    liga_codigo_liga         INTEGER NOT NULL
);

CREATE UNIQUE INDEX resultado__idx ON
    resultado (
        partido_codigo_partido
    ASC );

ALTER TABLE resultado ADD CONSTRAINT resultado_pk PRIMARY KEY ( codigo_resultado );

CREATE TABLE usuario (
    codigo_usuario   INTEGER NOT NULL,
    usuario          VARCHAR2 
--  ERROR: VARCHAR2 size not specified 
     NOT NULL,
    contraseña       VARCHAR2 
--  ERROR: VARCHAR2 size not specified 
     NOT NULL
);

ALTER TABLE usuario ADD CONSTRAINT usuario_pk PRIMARY KEY ( codigo_usuario );

ALTER TABLE equipo
    ADD CONSTRAINT equipo_dueño_fk FOREIGN KEY ( dueño_codigo_dueño )
        REFERENCES dueño ( codigo_dueño );

ALTER TABLE jugador
    ADD CONSTRAINT jugador_equipo_fk FOREIGN KEY ( equipo_codigo_equipo )
        REFERENCES equipo ( codigo_equipo );

ALTER TABLE participar
    ADD CONSTRAINT participar_equipo_fk FOREIGN KEY ( equipo_codigo_equipo )
        REFERENCES equipo ( codigo_equipo );

ALTER TABLE participar
    ADD CONSTRAINT participar_jornada_fk FOREIGN KEY ( jornada_codigo_jornada )
        REFERENCES jornada ( codigo_jornada );

ALTER TABLE partido
    ADD CONSTRAINT partido_jornada_fk FOREIGN KEY ( jornada_codigo_jornada )
        REFERENCES jornada ( codigo_jornada );

ALTER TABLE partido
    ADD CONSTRAINT partido_resultado_fk FOREIGN KEY ( resultado_codigo_resultado )
        REFERENCES resultado ( codigo_resultado );

ALTER TABLE resultado
    ADD CONSTRAINT resultado_liga_fk FOREIGN KEY ( liga_codigo_liga )
        REFERENCES liga ( codigo_liga );

ALTER TABLE resultado
    ADD CONSTRAINT resultado_partido_fk FOREIGN KEY ( partido_codigo_partido )
        REFERENCES partido ( codigo_partido );



-- Informe de Resumen de Oracle SQL Developer Data Modeler: 
-- 
-- CREATE TABLE                            10
-- CREATE INDEX                             2
-- ALTER TABLE                             18
-- CREATE VIEW                              0
-- ALTER VIEW                               0
-- CREATE PACKAGE                           0
-- CREATE PACKAGE BODY                      0
-- CREATE PROCEDURE                         0
-- CREATE FUNCTION                          0
-- CREATE TRIGGER                           0
-- ALTER TRIGGER                            0
-- CREATE COLLECTION TYPE                   0
-- CREATE STRUCTURED TYPE                   0
-- CREATE STRUCTURED TYPE BODY              0
-- CREATE CLUSTER                           0
-- CREATE CONTEXT                           0
-- CREATE DATABASE                          0
-- CREATE DIMENSION                         0
-- CREATE DIRECTORY                         0
-- CREATE DISK GROUP                        0
-- CREATE ROLE                              0
-- CREATE ROLLBACK SEGMENT                  0
-- CREATE SEQUENCE                          0
-- CREATE MATERIALIZED VIEW                 0
-- CREATE MATERIALIZED VIEW LOG             0
-- CREATE SYNONYM                           0
-- CREATE TABLESPACE                        0
-- CREATE USER                              0
-- 
-- DROP TABLESPACE                          0
-- DROP DATABASE                            0
-- 
-- REDACTION POLICY                         0
-- TSDP POLICY                              0
-- 
-- ORDS DROP SCHEMA                         0
-- ORDS ENABLE SCHEMA                       0
-- ORDS ENABLE OBJECT                       0
-- 
-- ERRORS                                  15
-- WARNINGS                                 0
