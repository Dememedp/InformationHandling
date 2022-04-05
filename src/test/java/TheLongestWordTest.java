import static org.junit.jupiter.api.Assertions.*;

import functions.TheLongestWord;
import org.junit.jupiter.api.Test;

class TheLongestWordTest {
    @Test
    void testSolution() {
        TheLongestWord longestWord = new TheLongestWord();
        assertEquals(longestWord.getLongestWord(), "Hithisisthelongestword");
    }
}