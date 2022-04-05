import functions.CountLetters;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountLettersTest {
    @Test
    void testSolution() {
        CountLetters let = new CountLetters();
        assertEquals(let.getCountLetters(), 541);
    }
}
