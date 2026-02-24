pipeline {
    agent any

    environment {
        IMAGE_NAME = "raghunandhan7/java-app"
    }

    stages {

        stage('Build Docker Image') {
            steps {
                script {
                    docker.build(IMAGE_NAME)
                }
            }
        }

        stage('Push Docker Image') {
            steps {
                script {
                    docker.withRegistry('', 'dockerhub-credentials') {
                        docker.image(IMAGE_NAME).push("latest")
                    }
                }
            }
        }

        stage('Deploy Container') {
            steps {
                sh 'docker run -d --name java-container raghunandhan7/java-app'
            }
        }
    }
}