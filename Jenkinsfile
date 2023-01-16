pipeline{
    agent any
     stages {
    
    
        
        stage('maven build') {
            steps {
            
                
                sh 'ls'
                sh 'cd demo'
                sh 'pwd'
                sh 'mvn clean'
                sh 'mvn install -U'
            }
               
        }
    }
}
