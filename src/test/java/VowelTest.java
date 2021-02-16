import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class VowelTest {
    @Test
    public void testCase1() {
        assertEquals("Nope!", 5, Vowels.getCount("abracadabra"));
    }

}