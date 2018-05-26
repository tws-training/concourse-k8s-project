
```
fly -t lite login -c http://concourse-ci:8080
   
fly -t lite set-pipeline -p concourse-k8s-project -c pipeline.yml -l credentials.yml

fly -t lite destroy-pipeline -p concourse-k8s-project
```