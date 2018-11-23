#!/usr/bin/env groovy
templatePipeline {
    agent any

    stages {
        stage("Custom pre stage") {
            steps {
                echo "CUSTOM PRE STAGE !!!"
            }
        }

        singleStage {
            echo "SINGLE STAGE !!!"
        }

        stage("Custom post stage") {
            steps {
                echo "CUSTOM POST STAGE !!!"
            }
        }
    }
}