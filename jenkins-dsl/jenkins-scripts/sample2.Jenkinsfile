// jenkins-dsl/sample/param_pipeline_job.jenkins
pipelineJob('Sample/param-demo-pipeline') {
    description('Pipeline that demonstrates parameters and conditional stage')
    parameters {
        stringParam('ENV', 'dev', 'Target environment (dev/stage/prod)')
        booleanParam('RUN_SMOKE', true, 'Run smoke tests?')
    }
    definition {
        cps {
            script("""
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
            """.stripIndent())
            sandbox()
        }
    }
}
