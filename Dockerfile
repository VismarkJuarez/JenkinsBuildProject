FROM openjdk:8
ADD target/JenkinsBuildProject-0.0.1-SNAPSHOT.jar JenkinsBuildProject.jar
EXPOSE 1994
VOLUME /Controller
ADD . /Controller
ENTRYPOINT ["java", "-jar", "JenkinsBuildProject.jar"]