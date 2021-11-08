####Reference Spring MVC app.

Technologies used:

    Spring Maven

    Spring Data JPA

####To Run
mvn clean install -U

mvn compile

mvn spring-boot:run

or build JAR file with ./mvn clean package

test endpoint

curl http://localhost:8080/calendars
curl http://localhost:8080/calendar-events
