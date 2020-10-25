pipeline {

    agent any //this pipeline will run on any available Jenkins agent -- not relevant if you don't have multiple Jenkins nodes.

    stages {

        stage("clean"){
            steps{ //This is where the magic actually happens
                echo 'This is the CLEAN stage.'
                mvn clean
            }
        }


        stage("install"){
            steps{ //This is where the magic actually happens
                echo 'This is the INSTALL stage.'
                mvn install
            }
        }

    }
}

node {
    //Groovy script
}