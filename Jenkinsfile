pipeline {
    agent any 
    stages {
        stage('Build') { 
            steps {
                withAnt(ant : 'Ant')
                {
                  sh 'ant'
                 
                }
                 
            }
        }
        stage('Test') { 
            steps {
                 sh 'make check'
                junit 'reports/**/*.xml'
            }
        }
        stage('Deploy') { 
            steps {
                sh 'make publish'
            }
        }
    }
}


    
