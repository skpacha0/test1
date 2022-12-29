pipeline {
    agent any
    stages {
        stage('Example clean') {
            steps {
                sh "rm -rf /var/lib/jenkins/workspace/pipeline-demo-01/test1"
                sh "git clone https://github.com/skpacha0/test1.git"
                sh "mvn clean -f test1"
            }
        }
        stage('Example install') {
            steps {
                sh "mvn install -f /var/lib/jenkins/workspace/pipeline-demo-01/test1"
            }
        }
        stage('Example test') {
            steps {
                sh "mvn test -f /var/lib/jenkins/workspace/pipeline-demo-01/test1"
            }
        }
        stage('Example package') {
            steps {
                sh "mvn package -f /var/lib/jenkins/workspace/pipeline-demo-01/test1"
            }
        }
    }
}
