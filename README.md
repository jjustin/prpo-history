# prpo-history
Microservice developed as part of `Software development procedures` course. Works together with [prpo-project](../../../prpo-project) and [prpo-frontend](../../../prpo-frontend)  
Contains kubernetes deployment script

## Build and run
```
mvn clean package
java -jar api/target/history-1.0.0-SNAPSHOT.jar
```
## Notes
Unlike [prpo-project](../../../prpo-project) this microservice has no persistent storage
