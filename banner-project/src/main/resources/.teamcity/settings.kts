import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.maven
import jetbrains.buildServer.configs.kotlin.buildSteps.script
import jetbrains.buildServer.configs.kotlin.triggers.vcs

version = "2024.03"

project {
    buildType(BuildAndDockerize)
}

object BuildAndDockerize : BuildType({
    name = "Build and Dockerize"

    vcs {
        root(DslContext.settingsRoot)
    }

    steps {
        maven {
            name = "Maven Build"
            goals = "clean package"
            runnerArgs = "-DskipTests=false"
        }

        script {
            name = "Build Docker Image"
            scriptContent = """
                docker build -t banner-project:latest .
                docker tag banner-project:latest 14789/banner-project:latest
                docker tag banner-project:latest 14789/banner-project:%build.number%
                echo "Tagged images:"
                docker images | grep banner-project
            """.trimIndent()
        }
    }

    triggers {
        vcs {
            branchFilter = "+:*"
        }
    }
})