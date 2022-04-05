import functions.DeleteSentences;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeleteSentencesTest {
    @Test
    void testSolution() {
        DeleteSentences del = new DeleteSentences();
        assertEquals(del.getDeletedSentencesAmount(15), 5);
    }
}
