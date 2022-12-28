pipeline {
    agent any 
    stages {
        stage('print hello') { 
            steps {
                sh "echo 'HELLO'"
            }
        }
        stage('github repo') { 
            steps {
		sh "rm -rf test1"
                sh "git clone https://github.com/skpacha0/test1.git"
                

                
            }
        }
        stage('build artifact') { 
            steps {
		sh "mvn clean -f test1"
		sh "mvn install -f test1"
		sh "mvn package -f test1"
                
            }
        }
    }
}

