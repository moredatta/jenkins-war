pipeline{
    agent any
    
    stages {
        stage('maven build') {
            steps {
                sh 'ls'
                sh 'dir ('demo') {
                        sh 'pwd'
                            }'
                sh 'ls'
                sh 'mvn clean'
                sh 'mvn install -U'
            }
               
        }
    }
}
