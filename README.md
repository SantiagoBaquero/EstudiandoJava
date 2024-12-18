# EstudiandoJava



## Instalación de JDK 📂

<p>En este texto para un readme de GitHub haces que las imágenes queden debajo del texto correspondiente puedes usar HTML.</p>

<p>Ingresamos a disco local C</p>
<img src="https://github.com/SantiagoBaquero/EstudiandoJava/assets/102531445/57c2a268-ca0d-4937-904f-eeef66f97059" alt="imagen">

<p>Nos dirigimos a archivos de programa ingresamos a ella</p>
<img src="https://github.com/SantiagoBaquero/EstudiandoJava/assets/102531445/9e544f1a-75fa-4d8f-9446-7d7f8cda0fa9" alt="imagen">

<p>Dentro de archivos de programa creamos una carpeta con el nombre "Java"</p>
<img src="https://github.com/SantiagoBaquero/EstudiandoJava/assets/102531445/18f845e5-f13a-4669-a15e-8e34688c4b23" alt="imagen">

<p>Posterior a ello descargamos el JDK que seamos instalar ya sea por medio de instalador o comprimido en la página original de Oracle:</p>

<p><a href="https://www.oracle.com/co/java/technologies/downloads/">https://www.oracle.com/co/java/technologies/downloads/</a></p>

<img src="https://github.com/SantiagoBaquero/EstudiandoJava/assets/102531445/3d559a41-7ba9-45f4-bc24-19f53da4a949" alt="imagen">

<p>En el caso de hacer uso de instalador como se muestra en la imagen este selecciona la ruta de forma automática (si tiene otras versiones de java usando el instalador puede que borre la carpeta)</p>
<img src="https://github.com/SantiagoBaquero/EstudiandoJava/assets/102531445/f0e7a084-7211-4cbc-8f5d-2fc94deacd85" alt="imagen">

<p>Si lo realizamos con archivo comprimido este se extrae en la ruta que creamos ()</p>
<img src="https://github.com/SantiagoBaquero/EstudiandoJava/assets/102531445/ade31f67-98c1-49a2-9f4c-60901e1f86f1" alt="imagen">

<p>De las dos maneras quedando de esta forma los archivos</p>
<img src="https://github.com/SantiagoBaquero/EstudiandoJava/assets/102531445/7a127d4f-09a5-4107-b9ed-2cf047b5a819" alt="imagen">

<p>Posterior a ello nos dirigimos a las variables de entorno del sistema para ubicarlo hacemos uso de la búsqueda de Windows </p>
<img src="https://github.com/SantiagoBaquero/EstudiandoJava/assets/102531445/4a571be9-3ddd-4abd-a8a7-83be2f88ac69" alt="imagen">

<p>Una vez abierta esta opción le damos click a variables de entorno como se muestra en la imagen:</p>
<img src="https://github.com/SantiagoBaquero/EstudiandoJava/assets/102531445/6b4428b9-5b45-479b-9686-a177d827c9ff" alt="imagen">

<p>Una vez dentro damos click al path y editar o podemos realizar un doble click sobre el path</p>
<img src="https://github.com/SantiagoBaquero/EstudiandoJava/assets/102531445/aea9b5a7-453c-4da6-9971-6dc6a4b98912" alt="imagen">

<p>Dentro de este creamos una línea que contenga la ruta de nuestro JDK y le incluimos el \bin quedando de esta manera (C:\Program Files\Java\jdk-21\bin) si encuentran otra versión de java lo borran pueden salir como java Oracle jdk jrae javapath lo eliminan quedando únicamente la que creamos como se muestra en la imagen y pulsamos aceptar </p>
<img src="https://github.com/SantiagoBaquero/EstudiandoJava/assets/102531445/65d6053d-2cf8-4f7d-95d8-55473d5ccd2d" alt="imagen">

<p>Posteriormente en variables de sistema creamos una nueva con el nombre JAVA_HOME y la ubicación de nuestra carpeta (C:\Program Files\Java\jdk-21)</p>
<img src="https://github.com/SantiagoBaquero/EstudiandoJava/assets/102531445/5dc39823-274f-41ea-97f1-c9f927c3fbf8" alt="imagen">

<p>Para comprobar que este realizado de forma correcta abrimos CMD o PowerShell y escribimos "Java -version" la cual nos mostrará la versión que instalamos</p>
<img  src="https://github.com/SantiagoBaquero/EstudiandoJava/assets/102531445/76c69e4a-f4b6-4fef-ae47-202bbfce1a50" alt="imagen">

<p>Para comprobar la versión del compilador se utiliza el comando "javac -version" </p>
<img src="https://github.com/SantiagoBaquero/EstudiandoJava/assets/102531445/4c0c97df-cc70-45e1-a3c1-daf70a99094e" alt="imagen">

<p>Con esto finalizamos la instalación del JDK para la programación del resto del contenido</p>

## Hello World 📂
Presenta la impresión de un Hello World

## Tipos de dato 📂

En esta carpeta podemos encontrar:
- TiposDeDato
- EjemploPrimitivosEnteros
- EjemploPrimitivosFloat
- PrimitivosCaracteres
- Sistemas Numericos:

  ### Tipos de dato 📑

  >
  >En este archivo podemos encontrar la conversión de
  >1. INT - BINARY  "También se muestra como declarar binary  ('0B')"  
  >2. INT - OCTAL  "También se muestra como declarar octal  ('0')"
  >3. INT - HEXADECIMAL "También se muestra como declarar hexadecimal  ('0X')"
     
<img src="https://github.com/SantiagoBaquero/EstudiandoJava/assets/102531445/63837d08-59b7-43ac-9f44-ff59dc211512" alt="imagen">


La impresión del mismo se realiza gracias a JOptionPane como se muestra a continuación:


<img src="https://github.com/SantiagoBaquero/EstudiandoJava/assets/102531445/b34eae53-d2fa-47e7-8a93-0e146db347bf" alt="imagen">
<img src="https://github.com/SantiagoBaquero/EstudiandoJava/assets/102531445/74701a39-5f3d-4ab4-9dfe-2459e039817a" alt="imagen">

- Sistemas Numéricos Enteros

En este encontramos la misma funcionalidad que Sistemas numéricos solo que este es realizado por medio de consola.

- Se añade sistema de conversión de datos

Se muestran diferentes ejemplos de conversión de datos 

<img src="https://github.com/SantiagoBaquero/EstudiandoJava/assets/102531445/c73abbe3-aa5d-497d-8347-d29b1a11db03" alt="imagen">

- Factura por Scanner y por Jopt

Se muestra un ejercicio de factura por Scanner y Jopt

Se va a solicitar el nombre para la factura
2 valores de producto el impuesto es del 19%

<img src="https://github.com/SantiagoBaquero/EstudiandoJava/assets/102531445/d07d7351-7b2d-47f9-91b9-c56f657885f9" alt="imagen">

Con el Jopt

<img src="https://github.com/SantiagoBaquero/EstudiandoJava/assets/102531445/1177d82a-e90f-4a60-87d3-6b9c49173036" alt="imagen">
<img src="https://github.com/SantiagoBaquero/EstudiandoJava/assets/102531445/015d1006-bb28-4d44-9908-e37108fe12cf" alt="imagen">
<img src="https://github.com/SantiagoBaquero/EstudiandoJava/assets/102531445/3d16113d-9ee2-4155-acb3-14a66062dffc" alt="imagen">

# Tipos de String 

