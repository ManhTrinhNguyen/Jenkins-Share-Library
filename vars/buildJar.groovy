#!/user/bin/env groovy

def call() {
  echo 'Building Application ....'
  sh 'mvn package'
}

