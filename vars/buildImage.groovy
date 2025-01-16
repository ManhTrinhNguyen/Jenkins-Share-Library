#!/user/bin/env groovy

def call() {
  echo "building the docker image..."
    withCredentials([usernamePassword(credentialsId: 'docker-hub-credentials', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        sh 'docker build -t nguyenmanhtrinh/demo-app:jma-4.0 .'
        sh 'echo $PASS | docker login -u $USER --password-stdin'
        sh 'docker push nguyenmanhtrinh/demo-app:jma-4.0'
    }
}