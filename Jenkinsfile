pipeline {
    agent any

    tools {
        maven "M3"
    }

    stages {
        stage('Build') {
            steps {
                sh "mvn clean package"

            }
        }
        stage('Test'){
            steps {
                 sh "mvn test"
            }
        }
        stage('Deploy') {
            steps {
                script{
                    sh 'docker build -t kacperwieczork/lab6 .'
                    sh 'docker login -u kacperwieczork -p p'
                    sh 'docker push kacperwieczork/lab6'
                    }
                }
            }
        }
    }

}
