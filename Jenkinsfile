pipeline {
    agent any

    environment {
        NameSpace='linwenjun'
        WebServer='172.31.12.139'
    }

    stages {

        stage('Deploy') {
            steps {
                withCredentials([sshUserPrivateKey(credentialsId: "training_pem", keyFileVariable: 'keyfile')]) {
                    sh './deploy.sh'
                }
            }
        }
    }
}