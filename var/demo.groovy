pipeline {
    agent any

    stages {
        stage('Print') {
            steps {
                echo 'Hello World '
            }
        }
        stage('Checkout') {
            steps {
               checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/skpacha0/test1.git']]])
            }
        }
        stage('build') {
            steps {
                sh "mvn clean verify"
            }
        }  
    }
    post { 
        always { 
            echo 'Thanks for running the job!'
        }
    }
}
