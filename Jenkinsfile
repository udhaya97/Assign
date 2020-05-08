def antVersion = 'Ant_1.10.7'
pipeline {
    agent any 
    stages {
        stage('Build') {
            steps { withEnv( ["ANT_HOME=${tool antVersion}"] ) {
    sh '$ANT_HOME/bin/ant'
}

   
        }
    }
    
        stage('Test') { 
            steps {
                echo "Unit tests (JUnit)..."
                echo "Mutation tests (pitest)..."

                bat "$ANT_HOME%/bin/ant.bat run-unit-tests"
                bat "$ANT_HOME%/bin/ant.bat run-mutation-tests"
            }
        }
        stage('Deploy') { 
            steps {
                echo '${ant}'
            }
        }
    }
}

    
