def call(Map config = [:]){
   git url : "${config.url}",branch: "${config.branch}"
}
