@Library('pipeline-library-demo')_

pipeline {
    agent any
    stages{
        stage('Run Maven') {
            steps{
                mavenBnR()
            }
        }
    }
}
/*
node {
      stage('Demo') 
      {
         echo 'Hello World'
         sayHello 'Jayanth'

      }
      
      stage('Checkout Code')
      {
            git 'https://github.com/MukeshPurohit/pipeline-library-demo.git'
      }
     
    stage('Run Unit Tests') 
      {
      }  
      

}
*/
