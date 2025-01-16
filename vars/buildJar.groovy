#!/user/bin/env groovy

def call() {
  echo "Building Application for $BRANCH_NAME"
  sh 'mvn package'
}

