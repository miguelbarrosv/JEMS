DROP FUNCTION FUN_CALCULARJUGADORES;

SET SERVEROUTPUT ON

CREATE OR REPLACE FUNCTION FUN_CALCULARJUGADORES--ESTA FUNCION VA A CALCULAR EL NUMERO DE JUGADORES POR EQUIPO
    (EQUIPO_ID IN EQUIPO.COD_EQUIPO%TYPE) --VARIABLE EN LA CUAL GUARDAMOS EL CODIGO DEL EQUIPO
RETURN NUMBER AS
    MIEMBROS NUMBER; --CREACION VARIABLE TIPO NUMBER
BEGIN
    SELECT COUNT(*) INTO MIEMBROS --SELECT PARA CONTAR EL NUMERO DE JUGADORES POR EQUIPO
      FROM JUGADOR
      WHERE  EQUIPO_COD_EQUIPO = EQUIPO_ID;
    RETURN(MIEMBROS); --RETORNAMOS LA VARIABLE NUMBER
END FUN_CALCULARJUGADORES;

/
CREATE OR REPLACE PROCEDURE PROC_VERMIEMBROSEQUIPO --PROCEDIMIENTO CON EL CUAL MOSTRAMOS LOS JUGADORES DE CADA EQUIPO UTILIZANDO
AS --LA FUNCION CREADA ANTERIORMENTE: FUN_CALCULARJUGADORES // EN EL CASO DE QUE NO TENGA JUGADORES MOSTRARA LA CANTIDAD DE 0
    MIEMBROS NUMBER;
BEGIN 
    MIEMBROS := FUN_CALCULARJUGADORES(02); --GUARDAMOS LA FUNCION ANTERIOR EN UNA VARIABLE Y EL CODGIO DEL EQUIPO QUE QUEREMOS MOSTRAR
    DBMS_OUTPUT.PUT_LINE('EL EQUIPO TIENE: '|| MIEMBROS || ' jugadores.' );
END PROC_VERMIEMBROSEQUIPO;

EXECUTE PROC_VERMIEMBROSEQUIPO; --EJECUTAMOS EL PROCEDIMIENTO