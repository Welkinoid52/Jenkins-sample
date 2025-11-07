// seed-job-dsl.groovy  (this file is run by the seed job or referenced as external)
freeStyleJob('Seed-Job') {
    label('built-in')
    scm {
        git {
            branch('main')
            remote {
                url('https://github.com/Welkinoid52/Jenkins-sample.git')
            }
        }
    }
    steps {
        dsl {
            // load DSL files from repo workspace path 'jenkins-dsl/demo/'
            // change paths to match your repo layout
            external('jenkins-dsl/sample/folders.jenkins')
            external('jenkins-dsl/sample/**/*_job.jenkins')
            // or use external('jenkins-dsl/demo/*.jenkins') for simpler
        }
    }
    triggers {
        githubPush()
    }
}
