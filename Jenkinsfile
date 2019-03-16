job('GradleJavaJob') {
    scm {
        git('https://github.com/kjdharris/jenkins-java-project') {  node -> // is hudson.plugins.git.GitSCM
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    wrappers {
        gradle('gradle')
    }
    steps {
        shell("gradle build")
    }
}
