pipeline{
    agent any
     stages {
    
    
        
        stage('maven build') {
            steps {
            
                
                sh 'ls'
                sh 'cd /var/lib/jenkins/workspace/spring/demo'
                sh 'pwd'
               
                sh 'ls'
                sh 'mvn clean'
                sh 'mvn install -U'
            }
               
        }
    }
}
