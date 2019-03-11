import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class EulerTests {
    @Test
    fun euler1Test() {
        Assertions.assertEquals(233168, Euler1().calculate())
    }

    @Test
    fun euler2Test() {
        Assertions.assertEquals(4613732, Euler2().calculate())
    }

    @Test
    fun euler3Test() {
        Assertions.assertEquals(6857, Euler1().calculate())
    }

    @Test
    fun euler4Test() {
        Assertions.assertEquals(906609, Euler1().calculate())
    }

    @Test
    fun euler5Test() {
        Assertions.assertEquals(906609, Euler1().calculate())
    }

    @Test
    fun euler6Test() {
        Assertions.assertEquals(25164150, Euler1().calculate())
    }

    @Test
    fun euler7Test() {
        Assertions.assertEquals(104743, Euler1().calculate())
    }

    @Test
    fun euler8Test() {
        Assertions.assertEquals(23514624000, Euler1().calculate())
    }

    @Test
    fun euler9Test() {
        Assertions.assertEquals(31875000, Euler1().calculate())
    }

    @Test
    fun euler10Test() {
        Assertions.assertEquals(142913828922, Euler1().calculate())
    }
}