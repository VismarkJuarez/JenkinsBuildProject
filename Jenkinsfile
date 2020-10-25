pipeline {

    agent any //this pipeline will run on any available Jenkins agent -- not relevant if you don't have multiple Jenkins nodes.

    stages {

        stage("pull"){
            steps{ //This is where the magic actualy happens
                echo 'This is the PULL stage.'
            }
        }

        stage("clean"){
            steps{ //This is where the magic actually happens
                echo 'This is the CLEAN stage.'
            }
        }


        stage("install"){
            steps{ //This is where the magic actually happens
                echo 'This is the INSTALL stage.'
            }
        }

    }
}

node {
    //Groovy script
}