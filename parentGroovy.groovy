evaluate(new File("subGroovy.groovy"))

def testSubGroovyFile() {
    subGroovy = new subGroovy()

    subGroovy.mvnTest()
}

return this