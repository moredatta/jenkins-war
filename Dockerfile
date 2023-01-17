FROM tomcat:8.5.47-jdk8-openjdk
COPY /var/lib/jenkins/workspace/${JOB_NAME}/demo/*.war /usr/local/tomcat/webapps
EXPOSE 8081
