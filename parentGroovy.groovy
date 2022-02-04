//evaluate(new File("subGroovy.groovy"))
import subGroovy

def testSubGroovyFile() {
    def subGroovy = new subGroovy()

    subGroovy.mvnTest()
}

return this