#!groovy

node {
        currentBuild.result = "SUCCESS"
        
        try {
                stage "Prepare environment"
                  //sh 'env | sort'
                  checkout scm
                  //sh ('sudo usermod -aG docker jenkins && groups')
                  
                  sh "echo $env.BRANCH_NAME | tr '[:upper:]' '[:lower:]' > branchnamefile"
                  def branchName=readFile('branchnamefile').trim()
                  
                stage "Print Variables"
                   sh "pwd"
                   sh('cat /var/lib/jenkins/workspace/params.properties > COMMENT')
                   def stdout = readFile('COMMENT').trim()
                   sh "echo COMMENT"

        } catch (err) {
            throw err
        }
}
