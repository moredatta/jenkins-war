FROM tomcat:8.5.47-jdk8-openjdk
RUN echo $job
# COPY /var/lib/jenkins/workspace/$job/demo/*.war /usr/local/tomcat/webapps
EXPOSE 8081
