## Phase4-SCSB-Common

The SCSB Middleware codebase and components are all licensed under the Apache 2.0 license, with the exception of a set of API design components (JSF, JQuery, and Angular JS), which are licensed under MIT X11.
PHASE4-SCSB-COMMON is library jar that contains the utility, JPA, reports, search, service components and Properties constant classes that are used across different microservices. 
Phase4-SCSB-Common is not a microservice on its own but it is part of other microservices in the project. The SCSB-Common Project has all the common code that will be used across other SCSB Application.

## Software Required

      - Java 11
      - Docker 19.03.13   
      
## Build

- Download the Project , navigate inside project folder and build the project using below command


-${VersionNumber} - Current Version of Common Jar i.e. 2.0

./gradlew clean build -x test -DarchiveVersion=${VersionNumber} 

- Move the Generated Jar file to  **/<volume>/commonjar/**
