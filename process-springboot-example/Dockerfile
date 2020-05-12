FROM quay.io/kiegroup/kogito-springboot-ubi8:0.10
COPY target/process-springboot-example.jar /home/kogito/bin/app.jar
ENTRYPOINT [ "/home/kogito/kogito-app-launch.sh" ]