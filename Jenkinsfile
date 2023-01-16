pipeline{
    agent any
    
    stages {
        stage('cd'){
            dir ('demo') {
                sh 'pwd'
            }
        
        stage('maven build') {
            steps {
            
                
                sh 'ls'
                sh 'mvn clean'
                sh 'mvn install -U'
            }
               
        }
    }
}
