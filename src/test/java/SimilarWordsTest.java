import functions.SimilarWords;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimilarWordsTest {
    @Test
    void testSolution() {
        SimilarWords sim = new SimilarWords();
        assertEquals(sim.getLetterFrequency("a"), 8);
    }
}
