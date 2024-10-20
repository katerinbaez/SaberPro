FROM openjdk:17 
COPY "./target/SaberPro-1.jar" "app.jar"
EXPOSE 8013
ENTRYPOINT [ "java","-jar","app.jar" ]


##https://github.com/katerinbaez/FutbolSpring.git

