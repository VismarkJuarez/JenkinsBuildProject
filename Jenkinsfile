pipeline {

    agent any //this pipeline will run on any available Jenkins agent -- not relevant if you don't have multiple Jenkins nodes.

    tools {
        maven 'Maven 3.6.1'
    }

    stages {

        stage("initialize Maven"){
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
}