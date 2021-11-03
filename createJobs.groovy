//pipelineJob('pipelineJob') {
//    definition {
//        cps {
//            script(readFileFromWorkspace('pipelineJob.groovy'))
//            sandbox()
//        }
//    }
//}
pipelineJob('spring-demo-job') {
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