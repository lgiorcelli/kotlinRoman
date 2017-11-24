import kotlin.test.assertEquals
import org.junit.Test

class Test{


    @Test
    internal fun convertOneToI() {
        assertEquals("I", 1.toRoman)
    }

    @Test
    internal fun convertTwoToII() {
        assertEquals("II", 2.toRoman)
    }

    @Test
    internal fun convertThreeToIII() {
        assertEquals("III", 3.toRoman)
    }

    @Test
    internal fun convertFourToIV() {
        assertEquals("IV", 4.toRoman)
    }

    @Test
    internal fun convertFiveToV() {
        assertEquals("V", 5.toRoman)
    }

    @Test
    internal fun convertSixToVI() {
        assertEquals("VI", 6.toRoman)
    }


}