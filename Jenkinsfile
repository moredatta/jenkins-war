pipeline{
    agent any
    
    
        
        stage('maven build') {
            steps {
            
                
                sh 'ls'
                sh 'cd demo'
                sh 'mvn clean'
                sh 'mvn install -U'
            }
               
        }
    }
}
