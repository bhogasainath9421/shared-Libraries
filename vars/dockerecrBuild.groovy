def call(){
  sh 'docker build -t ${ECR_REPO_NAME}:${IMAGE_TAG} .'
}
