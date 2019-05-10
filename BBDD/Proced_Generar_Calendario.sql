DROP PROCEDURE GENERAR_CALENDARIO;

CREATE OR REPLACE PROCEDURE GENERAR_CALENDARIO(fecha_Inicio date, fecha_Final date)
IS 
v_fecha DATE;
v_dias_diferencia;

v_contador NUMBER := 0;
BEGIN 
    INSERT INTO JORNADA (FECHA_INICIO) VALUES(fecha_Inicio);
    LOOP
	TRUNC(ROUND(fecha_Inicio, fecha_Final),0) v_dias_diferencia;
	v_dia := v_dias_diferencia / 10;
	v_fecha := fecha_Inicio + v_dia;
        INSERT INTO JORNADA (FECHA_INICIO) VALUES(v_fecha);
        DBMS_OUTPUT.PUT_LINE('-20001',v_fecha);
	v_contador + 1;
	EXIT WHEN v_contador = 10;
    END LOOP;
    INSERT INTO JORNADA(FECHA_FIN)VALUES(fecha_Final);
END GENERAR_CALENDARIO;