FROM openjdk:11-jdk

ENV TZ=Asia/Shanghai

COPY target/*.jar hello.jar

EXPOSE 9898

VOLUME ["/opt/log"]

ENTRYPOINT ["java","-jar","hello.jar"]