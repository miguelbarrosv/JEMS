
DROP TABLE administrador CASCADE CONSTRAINTS;
DROP TABLE dueño CASCADE CONSTRAINTS;
DROP TABLE equipo CASCADE CONSTRAINTS;
DROP TABLE jornada CASCADE CONSTRAINTS;
DROP TABLE jugador CASCADE CONSTRAINTS;
DROP TABLE liga CASCADE CONSTRAINTS;
DROP TABLE participar CASCADE CONSTRAINTS;
DROP TABLE partido CASCADE CONSTRAINTS;
DROP TABLE resultado CASCADE CONSTRAINTS;
DROP TABLE usuario CASCADE CONSTRAINTS;


CREATE TABLE administrador (
    codigo_administrador   NUMBER(4) NOT NULL,
    usuario                VARCHAR2(20) NOT NULL,
    contraseña             VARCHAR2(20) NOT NULL,
    CONSTRAINT administrador_pk PRIMARY KEY ( codigo_administrador )
);

CREATE TABLE usuario (
    codigo_usuario   NUMBER(4) NOT NULL,
    usuario          VARCHAR2(20) NOT NULL,
    contraseña       VARCHAR2(20) NOT NULL,
    CONSTRAINT usuario_pk PRIMARY KEY ( codigo_usuario )
);


CREATE TABLE dueño (
    codigo_dueño     NUMBER(4) NOT NULL,
    nombre_dueño     VARCHAR2(20) NOT NULL,
    apellido_dueño   VARCHAR2(20) NOT NULL,
    CONSTRAINT dueño_pk PRIMARY KEY ( codigo_dueño )
);


CREATE TABLE equipo (
    codigo_equipo        NUMBER(4) NOT NULL,
    nombre_equipo        VARCHAR2(20) NOT NULL,
    presupuesto          NUMBER(6) NOT NULL,
    localidad            VARCHAR2(20) NOT NULL,
    dueño_codigo_dueño   NUMBER(4) NOT NULL,
    CONSTRAINT equipo_dueño_fk FOREIGN KEY ( dueño_codigo_dueño )
        REFERENCES dueño ( codigo_dueño ),
    CONSTRAINT equipo_pk PRIMARY KEY ( codigo_equipo )
);

CREATE TABLE jugador (
    codigo_jugador         NUMBER(4) NOT NULL,
    nombre_jugador         VARCHAR2(20) NOT NULL,
    apellido_jugador       VARCHAR2(20) NOT NULL,
    nickname               VARCHAR2(20) NOT NULL,
    sueldo                 NUMBER(6) NOT NULL,
    nacionalidad           VARCHAR2(20) NOT NULL,
    estado                 VARCHAR2(20) NOT NULL,
    equipo_codigo_equipo   NUMBER(4) NOT NULL,
    CONSTRAINT jugador_pk PRIMARY KEY ( codigo_jugador ),
    CONSTRAINT jugador_equipo_fk FOREIGN KEY ( equipo_codigo_equipo )
        REFERENCES equipo ( codigo_equipo )
);

CREATE TABLE jornada (
    codigo_jornada   NUMBER(4) NOT NULL,
    fecha            DATE NOT NULL,
    CONSTRAINT jornada_pk PRIMARY KEY ( codigo_jornada )
);

CREATE TABLE participar (
    equipo_codigo_equipo     NUMBER(4) NOT NULL,
    jornada_codigo_jornada   NUMBER(4) NOT NULL,
    CONSTRAINT participar_pk PRIMARY KEY ( equipo_codigo_equipo, jornada_codigo_jornada ),
    CONSTRAINT participar_equipo_fk FOREIGN KEY ( equipo_codigo_equipo )
        REFERENCES equipo ( codigo_equipo ),
    CONSTRAINT participar_jornada_fk FOREIGN KEY ( jornada_codigo_jornada )
        REFERENCES jornada ( codigo_jornada )
);


CREATE TABLE liga (
    codigo_liga NUMBER(4) NOT NULL,
    CONSTRAINT liga_pk PRIMARY KEY ( codigo_liga )
);

CREATE TABLE resultado (
    codigo_resultado         NUMBER(4) NOT NULL,
    puntuacion               NUMBER(3) NOT NULL,
    partido_codigo_partido   NUMBER(4) NOT NULL,
    liga_codigo_liga         NUMBER(4) NOT NULL,
    CONSTRAINT resultado_pk PRIMARY KEY ( codigo_resultado ),
    CONSTRAINT resultado_liga_fk FOREIGN KEY ( liga_codigo_liga )
        REFERENCES liga ( codigo_liga )
);

CREATE TABLE partido (
    codigo_partido               NUMBER(4) NOT NULL,
    equipoa                      VARCHAR2(20) NOT NULL,
    equipob                      VARCHAR2(20) NOT NULL,
    jornada_codigo_jornada       NUMBER(4) NOT NULL,
    resultado_codigo_resultado   NUMBER(4) NOT NULL,
    CONSTRAINT partido_pk PRIMARY KEY ( codigo_partido ),
    CONSTRAINT partido_jornada_fk FOREIGN KEY ( jornada_codigo_jornada )
        REFERENCES jornada ( codigo_jornada )
);

ALTER TABLE resultado ADD CONSTRAINT resultado_partido_fk FOREIGN KEY ( partido_codigo_partido )
        REFERENCES partido ( codigo_partido );
        
ALTER TABLE partido ADD CONSTRAINT partido_resultado_fk FOREIGN KEY ( resultado_codigo_resultado )
        REFERENCES resultado ( codigo_resultado );
        

CREATE UNIQUE INDEX partido__idx ON
    partido (
        resultado_codigo_resultado
    ASC );


CREATE UNIQUE INDEX resultado__idx ON
    resultado (
        partido_codigo_partido
    ASC );
