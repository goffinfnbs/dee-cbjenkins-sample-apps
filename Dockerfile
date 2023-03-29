FROM sharedbase-docker-prod.artifactory.aws.nbscloud.co.uk/base-openjdk17-jre:v0.1.0

LABEL org.opencontainers.image.authors="CICD.Platform@Nationwide.co.uk" \
org.opencontainers.image.title="Sample Java app" \
org.opencontainers.image.description="A Sample Java app"

VOLUME /tmp
ARG JAVA_OPTS
ENV JAVA_OPTS=$JAVA_OPTS
ARG USERNAME=dockeruser

USER root

WORKDIR /home/${USERNAME}

COPY target/demoapp-*.jar /demoapp.jar
EXPOSE 8080

RUN chown -R 999 /opt/app
USER 999

ENTRYPOINT ["exec","java","$JAVA_OPTS","-Djava.security.egd=file:/dev/./urandom","-Djava.io.tmpdir=/opt/app","-jar demoapp.jar"]