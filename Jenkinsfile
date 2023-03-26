pipeline{

    agent any

    stages{
        stage('Git Checkout'){
            steps{
                git 'https://github.com/AnupAma-shilpi/Hello_World_jenkins'
            }
        }
        stage('Unit Testing'){
            steps{
                sh 'mvn test'
            }
        }
        stage('Maven Build'){
            steps{
                sh 'mvn clean install'
                sh 'mvn compile'
            }
        }
    }
}