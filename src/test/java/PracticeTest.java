import org.junit.Test;
import static org.junit.Assert.assertEquals;

    public class PracticeTest {
        @Test
        public void testSolution() {
            assertEquals("############5616", Practice.maskify("4556364607935616"));
            assertEquals("#######5616",      Practice.maskify(     "64607935616"));
            assertEquals("1",                Practice.maskify(               "1"));
            assertEquals("",                 Practice.maskify(                ""));

            // "What was the name of your first pet?"
            assertEquals("##ippy",                                    Practice.maskify("Skippy")                                  );
            assertEquals("####################################man!",  Practice.maskify("Nananananananananananananananana Batman!"));
        }
    }

