#!/usr/bin/env groovy

def call(String mavenName = 'M3'){
    stage('Tests'){
        withMaven(
            maven: "${mavenName}"
        ){
            sh "mvn test"
        }
    }
    stage('Sonar'){
        withMaven(
            maven: "${mavenName}"
        ){
            script{
                try{
                  sh "mvn sonar:sonar"
                }catch (err){
                    echo 'Ate the error in sonar' //Temporarily
                }
            }
        }
    }
    stage('Package'){
        withMaven(
            maven: "${mavenName}"
        ){
            sh "mvn clean install -DskipTests -DskipITs"
        }
    }
    stage('Push to Nexus'){
        withMaven(
            maven: "${mavenName}"
        ){
            sh "mvn deploy -DskipTests -DskipITs"
        }
    }

}
