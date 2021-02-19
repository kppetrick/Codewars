package Kyu6;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ConversionTest {

    private Conversion conversion = new Conversion();

    @Test
    public void shouldConvertToRoman() {
//        assertEquals("solution(1) should equal to I", "I", conversion.solution(1));
//        assertEquals("solution(4) should equal to IV", "IV", conversion.solution(4));
//        assertEquals("solution(6) should equal to VI", "VI", conversion.solution(6));
//        assertEquals("solution(4) should equal to IV", "V", conversion.solution(5));
        assertEquals("solution(1) should equal to I", "XI", conversion.solution(11));
        assertEquals("solution(4) should equal to IV", "XIV", conversion.solution(14));
        assertEquals("solution(6) should equal to VI", "XVII", conversion.solution(17));
        assertEquals("solution(4) should equal to IV", "L", conversion.solution(50));
//        assertEquals("solution(4) should equal to IV", "LXXIV", conversion.solution(74));
//        assertEquals("solution(6) should equal to VI", "LXV", conversion.solution(65));
//        assertEquals("solution(4) should equal to IV", "XC", conversion.solution(90));
    }
}
