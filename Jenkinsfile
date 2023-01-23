pipeline{
    agent any
	stages {
        stage('maven location') {
             steps {
            
                sh'''
                  pwd
                  cd /var/lib/jenkins/workspace/${JOB_NAME}/demo
                  ls
                  mvn clean
                  mvn install
              
              
                  '''
             }
         }
	
	}
}
