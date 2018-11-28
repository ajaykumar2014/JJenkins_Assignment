pipeline {
    agent any

     stages {
        stage ('Initialize') {
            steps {
                sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                '''
            }
        }
        stage ('Test') {
            steps {
                sh 'mvn clean test'
            }
        }
        stage ('Build') {
            steps {
                sh 'mvn -Dmaven.test.failure.ignore=true build'
            }
            post {
                success {
                    junit 'target/surefire-reports/**/*.xml'
                }
            }
        }
         
        stage ('Deploy') {
            steps {
                sh 'java -Dserver.port=9898 -jar target/dockerJenkins-1.0-SNAPSHOT.jar' 
            }
            
        } 
    }
}
