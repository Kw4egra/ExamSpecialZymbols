import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SpecialCharacterCounterTest {
    @Test
    public void testWithOnlySpecialCharacters() {
        String input = "!@#$%^&*";
        int expected = 8;
        assertEquals(expected, SpecialCharacterCounter.countSpecialCharacters(input));
    }

    @Test
    public void testWithAlphanumericAndSpecialCharacters() {
        String input = "abc123!@#";
        int expected = 3;
        assertEquals(expected, SpecialCharacterCounter.countSpecialCharacters(input));
    }

    @Test
    public void testWithNoSpecialCharacters() {
        String input = "Hello123";
        int expected = 0;
        assertEquals(expected, SpecialCharacterCounter.countSpecialCharacters(input));
    }

    @Test
    public void testWithEmptyString() {
        String input = "";
        int expected = 0;
        assertEquals(expected, SpecialCharacterCounter.countSpecialCharacters(input));
    }

    @Test
    public void testWithNullString() {
        String input = null;
        int expected = 0;
        assertEquals(expected, SpecialCharacterCounter.countSpecialCharacters(input));
    }
}
