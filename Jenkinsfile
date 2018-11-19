#!/usr/bin/env groovy
pipeline {
    agent any

    stages {
        stage("Custom pre stage") {
            steps {
                echo "CUSTOM PRE STAGE !!!"
            }
        }

        script {
            singleStage {
                echo "SINGLE STAGE !!!"
            }
        }

        stage("Custom post stage") {
            steps {
                echo "CUSTOM POST STAGE !!!"
            }
        }
    }
}