def call(){
    pipeline{
    agent any
    stages{
        stage('Build-main'){
            when{
                branch "main"
            }
            steps {
                buildProject()
            }
        }
        stage('Deploy-main'){
            when{
                branch "main"
            }
            steps {
               deployProject('/var/www/')  
            }
        }
        stage('Build-dev'){
            when{
                branch "dev"
            }
            steps {
                buildProject()
            }
        }
        stage('Deploy-dev'){
            when{
                branch "dev"
            }
            steps {
                deployProject('/var/www/')
            }
        }
        stage('Build-feature'){
            when{
                branch "feature"
            }
            steps {
                buildProject()
            }
        }
        stage('Deploy-feature'){
            when{
                branch "feature"
            }
            steps {
                deployProject('/var/www/')
            }
        }
        
    }
}
}