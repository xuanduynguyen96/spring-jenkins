pipeline {
    agent any

    tools {
        maven 'Maven 3.8.6'
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'jenkins', url: 'https://github.com/xuanduynguyen96/spring-jenkins.git'
            }
        }
        
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
    }
}
