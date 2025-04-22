def call(){
  sh """
   mvn -Dmaven.test.failure.ignore=true clean package
   mv target/*.jar target/saviynt-apponboarding-${env.BRANCH_NAME}.jar
  """
}

