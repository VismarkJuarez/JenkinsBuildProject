pipeline {

    agent any //this pipeline will run on any available Jenkins agent -- not relevant if you don't have multiple Jenkins nodes.

    tools {
       maven 'maven3.6.3'
       jdk 'JDK 1.8'
    }

    stages {

        stage("initialize"){
            steps{
                sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                '''
            }
        }

        stage("clean"){
            steps{ //This is where the magic actually happens
                echo 'This is the CLEAN stage.'
                sh 'mvn clean'
            }
        }


        stage("install"){
            steps{ //This is where the magic actually happens
                echo 'This is the INSTALL stage.'
                sh 'mvn install'
            }
        }

    }
}

node {
    //Groovy script
    checkout scm
    docker.withRegistry('https://registry.hub.docker.com', 'DOCKER_CREDENTIALS') {
        def customImage = docker.build("jenkinsbuildproj:${env.BUILD_ID}")

        /* Push the container to the custom Registry */
        customImage.push()
    }
}