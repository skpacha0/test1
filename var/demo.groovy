@Library("my-lib") _
pipeline {
    agent any

    stages {
        stage('Print') {
            steps {
                printstage()
            }
        }
        stage('Checkout') {
            steps {
                checkoutstage()
               
            }
        }
        stage('build') {
            steps {
                executemavenstep()
            }
        }  
    }
    post { 
        always { 
            echo 'Thanks for running the job!'
        }
    }
}
