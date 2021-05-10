FROM maven:3.5-alpine
LABEL maintainer="fengdaochen@haier.com"

COPY target/cicd-demo.jar workspace/

WORKDIR workspace/
EXPOSE 9090

ENTRYPOINT [ "java", "-jar", "/workspace/cicd-demo.jar"]