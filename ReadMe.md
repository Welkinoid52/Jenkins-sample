# Demo Job DSL repository (sample)

This repo contains a demo Job DSL setup for Jenkins.

Structure:
- `jenkins-dsl/sample/` : Job DSL files that create folders and jobs.
- `jenkins-dsl/sample/Jenkinsfile` : The Jenkinsfile used by the generated pipeline job.
- `Jenkinsfile` : parent pipeline that triggers the seed job in Jenkins.

**Before using**
1. My repo HTTPS URL `https://github.com/Welkinoid52/Jenkins-sample.git`.
2. Push this repo to GitHub (branch `main`).
3. Create a seed job in Jenkins (see `seed-job-dsl.groovy` if you want to create it via Job DSL). Configure seed job to checkout this repo `main` branch and process job DSL files under `jenkins-dsl/sample/`.
4. Run the seed job once — it will create `Sample/my-sample-pipeline`, `Sample/hello-freestyle`, and folders.
