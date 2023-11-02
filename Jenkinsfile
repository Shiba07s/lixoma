pipeline {
    agent any
 
    stages {
        stage('GetCode') {
            steps {
                git 'https://github.com/satya918/TTSSo1.git'
            }
        }
 
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
        }
    }

