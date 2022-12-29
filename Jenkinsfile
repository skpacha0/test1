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
		sh  "echo 'test1 :::::::::)))))))' "
	     }
        }
        stage('build artifact') { 
            steps {
		sh "sudo mvn install -f test1"
		sh "sudo mvn package -f test1"
		sh "echo 'ITS DONE' "
                
            }
        }
    }
}



