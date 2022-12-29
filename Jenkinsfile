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
		sh echo "will check later about repository"
                

                
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

