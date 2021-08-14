# DW2

How to start the DW2 application
---

1. Run `mvn clean install` to build your application
1. Start application with `java -jar target/DW2-1.0-SNAPSHOT.jar server DW2-config.yml`
1. To check that your application is running enter url `http://localhost:8080`

Health Check
---

To see your applications health enter url `http://localhost:8081/healthcheck`
