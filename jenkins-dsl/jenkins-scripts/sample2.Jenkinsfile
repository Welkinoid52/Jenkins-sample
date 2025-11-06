pipeline {
  agent any
  stages {
    stage('Info') {
      steps {
        echo "ENV = \${params.ENV}, RUN_SMOKE = \${params.RUN_SMOKE}"
      }
    }
    stage('Deploy') {
      when { expression { return params.ENV != 'prod' } }
      steps {
        echo "Deploying to \${params.ENV} (not prod)"
      }
    }
    stage('Smoke') {
      when { expression { return params.RUN_SMOKE } }
      steps {
        echo "Running smoke tests..."
        sh 'echo OK'
      }
    }
  }
}
