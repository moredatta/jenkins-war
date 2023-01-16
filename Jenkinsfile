pipeline{
    agent any
    
    stages {
        stage('maven build') {
            steps {
                sh 'ls'
                sh 'dir ('subdir') {
                        sh 'pwd'
                            }'
                sh 'ls'
                sh 'mvn clean'
                sh 'mvn install -U'
            }
               
        }
    }
}
