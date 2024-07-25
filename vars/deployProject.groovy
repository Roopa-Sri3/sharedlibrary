def call(String targetDir) {
    sh "cp -r /var/lib/jenkins/workspace/demo/build ${targetDir}"
}