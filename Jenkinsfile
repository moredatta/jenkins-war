pipeline{
    agent any
    
    stages {
        stage('maven build') {
            steps {
                sh 'demo'
                sh 'mvn clean'
                sh 'mvn install -U'
            }
               
        }
    }
}
