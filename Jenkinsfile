pipeline{
    agent any
    
    stages {
        stage('maven build') {
            steps {
                sh 'mvn clean'
                sh 'mvn install -U'
            }
               
        }
    }
}
