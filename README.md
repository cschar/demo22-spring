
# README


stuff to implement




http://www.littlebigextra.com/part-1-authorising-user-using-spring-social-google-facebook-and-linkedin-and-spring-security/

https://medium.com/what-to-build/dear-zuck-fd25ecb1aa5a
https://medium.com/what-to-build/how-to-design-social-systems-without-causing-depression-and-war-3c3f8e0226d1


map data:
https://planet.openstreetmap.org/  63 gb planet map file



### eclipse dev

ctrl+shift+O --- all imports at once


### db migrations

http://www.baeldung.com/database-migrations-with-flyway

mvn clean flyway:migrate -Dflyway.configFile=flyway.properties
mvn flyway:info -Dflyway.configFile=flyway.properties

credentials in application.properties, dont need to specify
mvn flyway:clean
mvn flyway:migrate

