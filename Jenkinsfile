#!/usr/bin/env groovy
node {
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