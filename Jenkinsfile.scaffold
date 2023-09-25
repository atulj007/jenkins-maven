pipeline{

    agent any

// uncomment the following lines by removing /* and */ to enable
/*    tools{
       maven 'Maven 3.6.3' 
    }
*/    

    stages{
        stage('Cleaning Stage'){
            steps{
                sh "mvn clean"
            }
        }
        stage('Testing Stage'){
            steps{
              sh "mvn test"  
            }
        }
        stage('Packaging Stage'){
            steps{
                sh "mvn package"
            }
        }
    }

