pipeline{
    agent any
     stages {
    
    
        
        stage('maven build') {
            steps {
            
                
                sh 'ls'
                sh 'cd demo'
                sh 'pwd'
                sh 'cd /var/lib/jenkins/workspace/spring'
                sh 'ls'
                sh 'mvn clean'
                sh 'mvn install -U'
            }
               
        }
    }
}
