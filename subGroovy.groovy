class subGroovy {
    def mvnTest() {
        echo 'testing maven'
        sh 'mvn clean install'
        sh 'mvn -Dtest=BasicDemo test'
    }
}

return subGroovy