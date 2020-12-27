FROM openjdk:11
RUN useradd -ms /bin/bash spring
USER spring
ADD build/libs/*.jar /home/spring/application.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/home/spring/application.jar"]
