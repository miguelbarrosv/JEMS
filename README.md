# JEMS
Proyecto de E-Sports
Egibide DAW 2019

  Enlace a trello: https://trello.com/jems27/home
  Enlace a Drive:  https://drive.google.com/drive/folders/0AGLGPpQ5XJJgUk9PVA

	BBDD		: Carpeta en la que almacenaremos la base de datos, el MER, 
				  MR y tanto los disparadores como procedimientos etc...
	Diagramas	: Todo lo relacionado con Entornos de Desarrollo, Diagramas 
				  de clases, de secuencia...
	Documentos	: Nuestro dia a dia documentado tanto como evidencias de la	
				  metodologia del tipo SCRUM
	Reto		: NetBeans. Carpeta que contendra la codificacion de nuestro
				  programa.
	XML		: Guardaremos los XML, DTD y XSD base y cuando se actualicen
				  una copia aparte. Tambien almacenara una copia del DOM y SAX.
  
  Una vez finalizada la instalación y puesto en marcha el programa lo primero será introducir el  nombre de usuario del administrador y su respectiva contraseña, si son correctos se iniciará la interfaz destinada al administrador. 

Esta será la primera ventana que veamos una vez hayamos iniciado sesión con el administrador, desde aquí podremos acceder a todas y cada una de las opciones que puede hacer el administrador, como podemos comprobar, la liga está en estado Offline, eso quiere decir que o no esta creada, o no está aún iniciada.
También tenemos a mano izquierda  los botones de usuario, equipo, dueño y jugador. Desde estos botones podremos modificarlos, añadirlos, borrarlos y consultarlos. 
El botón de administrar viene siendo para crear la liga, e introducir los resultados de la jornada, por su contraparte el de mirar, es para consultar las jornadas y la clasificación. 
Tenemos un botón de cerrar sesion por si decidimos cambiar de administrador o iniciar sesión como usuario. 

  
  ![alt text](https://github.com/SergioZulueta/JEMS/blob/master/Documentos/ImagenesManual/VLogin.PNG)
  
  ![alt text](https://github.com/SergioZulueta/JEMS/blob/master/Documentos/ImagenesManual/VAdministrador.PNG)

Datos a tener en cuenta:

Antes de proceder con la puesta en marcha de la aplicación, hay que asegurarse que se dispone de los siguientes recursos:
●	Un servidor de Base de Datos Oracle SQL
●	El entorno de Java instalado en aquellos dispositivos en los que se desee utilizar

Una vez comprobado eso podemos proceder con la ejecución de los Scripts de base de datos.

Base de Datos

Antes de proceder con la ejecución de los scripts hay que tener en cuenta que en una primera puesta en marcha de la aplicación TODOS son necesarios para un correcto inicio, más adelante, dentro de la misma aplicación,se podrán modificar los valores.

Si se quieren modificar los valores fuera de la aplicación , únicamente será necesario crear un administrador en la tabla ADMINISTRADOR y habrá que introducirlo un usuario y una contraseña que por defecto va a ser ‘A’, ‘A’.

El orden de ejecución de los scripts es el siguiente, primero ScriptCreacionBBDD.sql, segundo PaqueteProcFun.sql y para finalizar ScriptCargarDatos.sqll.
Se recomienda ejecutar los bloques de cada script por separado para evitar conflictos y errores.
Una vez ejecutados todos los scripts podemos pasar a la parte del código.


Conexión con la Base de Datos

Estando la Base de Datos iniciada y en funcionamiento normal, habrá que cambiar unos valores en un fichero .java cuya ruta es SuperProyecto/build/classes/DB/DBController.java
ahí, dentro del método createConnection, en la línea que comienza con:
Connection con = DriverManager.getConnection(*****);
Habrá que cambiar los siguientes valores:
Donde ponga ‘@SrvOracle’ hay que poner el nombre del servidor o la ip mediante la cual se accede a la base de datos, sin quitar la @.
Donde ponga ‘orcl’ habrá que poner el nombre de la base de datos como tal.
Finalmente donde pone ‘eqdaw02’ y’ eqdaw02’ pondrán respectivamente el nombre de usuario y la contraseña de acceso del usuario de la base de datos que se quiere utilizar para conectarse a la base de datos.


