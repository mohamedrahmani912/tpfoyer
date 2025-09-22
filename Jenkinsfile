pipeline {
    agent any
    stages {
        stage('Cloner le projet') {
            steps {
                git branch: 'master', url: 'https://github.com/mohamedrahmani912/tpfoyer.git'
            }
        }
        stage('Build') {
            steps {
                sh './mvnw clean install'  // si projet Maven
              
            }
        }
    }
}
