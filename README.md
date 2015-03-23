Una vez en el directorio donde se encuentra el proyecto : 

* mvn clean mvn package
*Copiar el archivo .war generado (./target/beeter-api.war) en la carpeta /webapps del directorio donde tengamos instalado Tomcat 
*Construcción de la BD en MySQL Acceder a MySQL como root y llamar (source) al archivo libdb-user.sql 
*Acceder a MySQL con los datos del nuevo usuario (libreria, libreria) y llamar al archivo libreriadb-schema.sql
*Ejecutar Tomcat y servidor MySQL 6- Realizar peticiones HTTP desde Postman