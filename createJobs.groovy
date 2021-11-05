pipelineJob('spring-demo-deploy-production-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/jacobwestwell/spring-demo.git'
                    }
                    branch 'main'
                }
            }
        }
    }
}
pipelineJob('spring-demo-deploy-pre-production-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/jacobwestwell/spring-demo.git'
                    }
                    branch 'preprod'
                }
            }
        }
    }
}
pipelineJob('spring-demo-deploy-development-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/jacobwestwell/spring-demo.git'
                    }
                    branch 'develop'
                }
            }
        }
    }
}