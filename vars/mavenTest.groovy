#!/usr/bin/env groovy

def call(String mavenToUse = 'M3'){
  // using the Pipeline Maven plugin we can set maven configuration settings, publish test results, and annotate the Jenkins console
  withMaven(
    maven: "${mavenToUse}"
  ){
      sh 'mvn clean test'
  }
}
