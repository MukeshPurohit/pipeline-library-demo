@Library('pipeline-library-demo')_

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
