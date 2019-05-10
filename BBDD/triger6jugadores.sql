DROP PACKAGE PAQ_MUTANTE;

CREATE OR REPLACE PACKAGE PAQ_MUTANTE AS --ESTE TRIGGER EXISTE SOLO PARA LA CREACION DE LAS VARIABLE QUE CONTIENE
  CODIGOEQUIPO JUGADOR.EQUIPO_COD_EQUIPO%TYPE :=NULL; --LAS CUALES EXISTEN SOLO PARA PREVENIR EL ERROR DE TABLA MUTANTE EN LOS TRIGGERS CODIFICADOS MAS ADELANTE
  SUELDOJUGADOR JUGADOR.SUELDO%TYPE :=NULL;
  SALMAX EQUIPO.PRESUPUESTO%TYPE :=NULL;
  JUGADORNOLIGA JUGADOR.EQUIPO_COD_EQUIPO%TYPE :=NULL;
END;

/
DROP TRIGGER TRIG_TRIGGERSMUTANTE;

CREATE OR REPLACE TRIGGER TRIG_TRIGGERSMUTANTE --ESTE TRIGGER EXISTE SOLO PARA RESOLVER EL PROBLEMA DE TABLA MUTANTE EN LOS SIGUIENTES TRES TRIGGERS
AFTER INSERT OR UPDATE ON JUGADOR --SE EJECUTA ANTES QUE LOS DOS SIGUIENTES TRIGGERS
FOR EACH ROW
BEGIN
  PAQ_MUTANTE.CODIGOEQUIPO := :NEW.EQUIPO_COD_EQUIPO;  --Y TODO LO QUE HACE ES INTRODUCIR LOS NUEVOS VALORES A LA VARIABLE QUE DECLARAMOS ANTES
  PAQ_MUTANTE.SUELDOJUGADOR := :NEW.SUELDO;
  PAQ_MUTANTE.JUGADORNOLIGA := :NEW.EQUIPO_COD_EQUIPO;
END;

/
DROP TRIGGER TRIG_MAXJUGADORES;

CREATE OR REPLACE TRIGGER TRIG_MAXJUGADORES --ESTE TRIGGER VA A LIMITAR LA CANTIDAD DE JUGADORES POR EQUIPO
  AFTER INSERT OR UPDATE ON JUGADOR
  DECLARE
    MIEMBROS NUMBER;
  BEGIN
    SELECT COUNT(EQUIPO_COD_EQUIPO) INTO MIEMBROS --UNA SELECT PARA CALCULAR LA CANTIDAD DE MIEMBROS ACTUALES EN EL EQUIPO
      FROM JUGADOR
       WHERE EQUIPO_COD_EQUIPO = PAQ_MUTANTE.CODIGOEQUIPO;   
      IF MIEMBROS > 6 --SI ES MAYOR A 6:
        THEN RAISE_APPLICATION_ERROR(-20001,'Un equipo no puede tener mas de 6 jugadores.'); --SALTA LA EXCEPCION
      END IF;  
  END;
