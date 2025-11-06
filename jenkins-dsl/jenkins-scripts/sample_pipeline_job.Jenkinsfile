// jenkins-dsl/sample/Jenkinsfile
pipeline {
  agent any
  stages {
    stage('Checkout') {
      steps {
        echo "This job's Jenkinsfile was loaded from the same branch (main) that created the job"
      }
    }
    stage('Echo') {
      steps {
        sh 'echo Hello from Sample pipeline'
      }
    }
  }
}
