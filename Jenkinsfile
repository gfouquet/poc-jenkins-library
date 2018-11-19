#!/usr/bin/env groovy
node {
    tools {
        maven "maven-3.6"
    }

    stage("Custom pre stage") {
        echo "CUSTOM PRE STAGE !!!"
    }

    singleStage {
        echo "SINGLE STAGE !!!"
    }

    stage("Custom post stage") {
        echo "CUSTOM POST STAGE !!!"
    }
}
