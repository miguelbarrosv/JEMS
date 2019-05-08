CREATE OR REPLACE TRIGGER TRIG_SAL_MIN_JUGADOR --Trigger para que el sueldo sea mayor que el SMI
BEFORE INSERT OR UPDATE 
ON JUGADOR 
FOR EACH ROW
BEGIN
    IF PAQUETE_MUTANTE.SUELDOJUGADOR < 736 THEN --Si el sueldo es menor que el SMI
         RAISE_APPLICATION_ERROR('-20003','No puede tener un sueldo menor que el Sueldo minimo profesional'); --Ejecutar el raise application error
    END IF; 
END TRIG_SAL_MIN_JUGADOR;

ALTER TRIGGER TRIG_SAL_MIN_JUGADOR DISABLE;
DROP TRIGGER TRIG_SAL_MIN_JUGADOR ;
