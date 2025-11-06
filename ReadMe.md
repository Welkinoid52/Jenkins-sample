🧩 Jenkins Demo — Folder Structure, Jobs, and RBAC
📘 Overview

This demo showcases Jenkins automation using Job DSL and RBAC (Role-Based Access Control).
It defines folder hierarchies, creates sample jobs, and configures restricted access for specific users.

🗂 Folder Structure

Defined in folders.jenkins using Job DSL:

folder('Sample') {
    description('Sample demo jobs for pipeline examples')
}

folder('Sample/TeamA') {
    description('TeamA demo folder')
}


Sample/ — Main folder for demo pipeline jobs.

Sample/TeamA/ — Subfolder for TeamA-specific jobs.

⚙️ Job DSL Scripts

Located under jenkins-dsl/sample/, the following example jobs demonstrate different Jenkins job types:

File Name	Description
sample_pipeline_job.jenkins	Basic pipeline job example
sample_freestyle_job.jenkins	Freestyle job example
my-parameter-pipeline.jenkins	Parameterized pipeline job
🔒 RBAC Configuration

Added RBAC for user tom, granting access only to the Sample folder, restricting visibility and permissions outside it.

🧠 Purpose

This demo illustrates how to:

Organize Jenkins jobs with a structured folder hierarchy

Automate job creation using Jenkins Job DSL

Enforce user-specific access controls with RBAC