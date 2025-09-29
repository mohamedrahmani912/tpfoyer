pipeline {
    agent any

    stages {
        stage("Git Clone") {
            steps {
                git branch: 'master',
                    url: 'https://github.com/mohamedrahmani912/tpfoyer.git'
            }
        }

        stage("Nettoyage du projet") {
            steps {
                sh 'mvn clean'
            }
        }

        stage("Maven Package") {
            steps {
                sh "mvn package -DskipTests=true"
            }
        }

        stage("Docker Build") {
            steps {
                sh 'docker build -t mohamedbram/tpfoyer .'
                sh 'docker images'
            }
        }

        stage("Docker Login & Push") {
            steps {
                sh 'echo "09873071Bram" | docker login --username mohamedbram --password-stdin'
                sh 'docker push mohamedbram/tpfoyer'
            }
        }
    }
}
