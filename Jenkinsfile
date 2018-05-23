pipeline {
    agent any

    environment {
        NameSpace='linwenjun'
        WebServer='172.31.12.139'
    }

    stages {

        stage('Sonar') {
            steps {
                sh './gradlew sonarqube'
            }
        }

        stage('Test') {
            steps {
                sh './gradlew test'
            }
        }

        stage('Package') {
            steps {
                sh './gradlew build'
            }
        }

        stage('Deploy') {
            steps {
                withCredentials([sshUserPrivateKey(credentialsId: "training_pem", keyFileVariable: 'keyfile')]) {
                    sh './deploy.sh'
                }
            }
        }
    }
}