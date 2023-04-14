## Hivel_Assessment

This project is to showcase my profile in Technology: Spring Boot | MongoDB | Apache_Kafka 


*Requried resources

##### Build project -> mvn clean install
##### -> Mongo DB Atlas remote server connection string [MongoDb](https://account.mongodb.com/account/login?_ga=2.186707873.862837358.1681463533-1738354520.1673778328 "Atlas Login")
##### -> Kafka Setup on local Machine

### Trade offs:
1.It's a job Post application where we posting job & do CRUD opr.
2.Make system event driven we have configured Apache Kafka in config package;


_Kafka command_:
1. .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties 
2. .\bin\windows\kafka-server-start.bat .\config\server.properties
3. kafka-console-consumer.bat --topic Topic_Test --from-beginning --bootstrap-server localhost:9092




>Ping if any suggestions & queries 👍)
