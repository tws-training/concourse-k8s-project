pipeline {
    agent any

    environment {
        NameSpace='linwenjun'
    }

    stages {

        stage('Checkout') {
            steps {
                git poll: true, url: 'https://github.com/tws-training/spring-boot-basic.git'
            }
        }

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

        stage('Deploy') {
            steps {
                sh 'whoami'
                withCredentials([sshUserPrivateKey(credentialsId: "training_pem", keyFileVariable: 'keyfile')]) {
                    sh "ssh -i $keyfile ubuntu@172.31.12.139 mkdir -p /home/ubuntu/works/$NameSpace"
                }
            }
        }
    }
}