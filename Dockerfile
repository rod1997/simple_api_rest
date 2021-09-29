FROM openjdk

COPY  ./ /

ENTRYPOINT ["./mvnw","spring-boot:run"]