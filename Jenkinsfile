pipeline {

    agent any //this pipeline will run on any available Jenkins agent -- not relevant if you don't have multiple Jenkins nodes.

    tools {
       maven 'Maven3.8.1'
       //jdk 'jdk8'
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

        stage("SHOW Artifactory credential details"){

            steps{

                withCredentials([usernamePassword(credentialsId: 'ARTIFACTORY',
                    passwordVariable: 'password', usernameVariable", usernameVariable: 'username')]){
                   sh '''
                        echo "ARTIFACTORY CREDS = ${ARTIFACTORY}"
                   '''
                  echo $username
                  echo $password
                }
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
                echo 'Listing directory:'
                sh 'ls'
            }
        }

//         stage("build docker image"){
//                     steps{ //This is where the magic actually happens
//                         echo 'Building the image'
//                         sh 'docker build -t jenkinsbuildproject .'
//
//                         echo 'showing list of all docker images'
//                         sh 'docker image ls'
//                     }
//                 }

    }
}

// node {
//     //Groovy script
//     checkout scm
//     docker.withRegistry('https://registry.hub.docker.com', 'DOCKER_CREDENTIALS') {
//         def customImage = docker.build("jenkinsbuildproj:${env.BUILD_ID}")
//
//         /* Push the container to the custom Registry */
//         customImage.push()
//     }
//}