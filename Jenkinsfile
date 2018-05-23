pipeline {
    agent any

    environment {
        NameSpace='linwenjun'
    }

    stages {
        stage('Deploy') {
            steps {
                sh './deploy.sh'
            }
        }
    }
}