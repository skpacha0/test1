pipeline {
    agent any
    stages {
        stage('Example clean') {
            steps {
                sh "rm -rf test1"
                sh "git clone https://github.com/skpacha0/test1.git"
                sh "mvn clean -f test1"
            }
        }
        stage('Example install') {
            steps {
                sh "mvn install -f test1"
            }
        }
        stage('Example test') {
            steps {
                sh "mvn test -f test1"
            }
        }
        stage('Example package') {
            steps {
                sh "mvn package -f test1"
            }
        }
    }
}
