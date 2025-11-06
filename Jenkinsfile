// Jenkinsfile (root) - Parent pipeline that triggers the seed job
pipeline {
  agent any
  stages {
    stage('Trigger Demo SeedJob') {
      steps {
        // This triggers the Seed job that will create the Sample jobs
        build job: 'Seed-Job', wait: true
      }
    }
  }
}
