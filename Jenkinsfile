def antVersion = 'Ant_1.10.7'
def tomcatWeb = 'G:\\Downloads\\apache-tomcat-9.0.33\\webapps'
   def tomcatBin = 'G:\\Downloads\\apache-tomcat-9.0.33\\bin'
   def tomcatStatus = ''
pipeline {
    agent any 
    stages {
        stage('Build') {
            steps { withEnv( ["ANT_HOME=${tool antVersion}"] ) {
    sh '$ANT_HOME/bin/ant'
}

   
        }
    }
    
       stage('Deploy to Tomcat'){
          steps{
     bat "copy target\\EmployeeCrudAnt.war \"${tomcatWeb}\\EmployeeCrudAnt.war\""
          }
   }
      stage ('Start Tomcat Server') {
         steps{
         sleep(time:5,unit:"SECONDS") 
         bat "${tomcatBin}\\startup.bat"
         sleep(time:100,unit:"SECONDS")
         }
   }
    }
}

    
