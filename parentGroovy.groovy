evaluate(new File("subGroovy.groovy"))

def testSubGroovyFile() {
    def subGroovy = new subGroovy()

    subGroovy.mvnTest()
}

return this