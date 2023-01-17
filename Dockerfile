FROM tomcat:8.5.47-jdk8-openjdk
COPY /var/lib/jenkins/workspace/spring/demo/*.war /usr/local/tomcat/webapps
EXPOSE 8081
