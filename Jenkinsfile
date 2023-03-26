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
            }
            steps{
                sh 'mvn compile'
            }
            steps{
                sh 'mvn spring-boot:run'
            }
        }
    }
}