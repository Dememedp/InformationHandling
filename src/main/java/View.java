import functions.CountLetters;
import functions.DeleteSentences;
import functions.SimilarWords;
import functions.TheLongestWord;

import java.util.Scanner;

public class View {
    public static void Init(){
        boolean exit = true;
        Scanner sc = new Scanner(System.in);
        final int LONGEST_WORD = 1, LESSER_WORDS = 2, SIMILAR_WORDS = 3, VOWELS_CONSONANTS = 4, EXIT = 0;
        while(exit){
            System.out.println("""
                    Hello! Choose functions:
                    1. Find sentence with the longest word
                    2. Delete sentences with lesser amount of words than given
                    3. Find similar words and count them
                    4. Count vowels and consonants
                    0. Exit
                    """);
            int choice = sc.nextInt();
            switch (choice){
                case LONGEST_WORD -> {
                    TheLongestWord word = new TheLongestWord();
                    word.printTheLongestWord();
                }
                case LESSER_WORDS -> {
                    System.out.println("Input amount of words:");
                    DeleteSentences sent = new DeleteSentences();
                    sent.printDeletedSentences(sc.nextInt());
                }
                case SIMILAR_WORDS -> {
                    SimilarWords sim = new SimilarWords();
                    sim.findSimilarWords();
                }
                case VOWELS_CONSONANTS -> {
                    CountLetters let = new CountLetters();
                    let.countLetters();
                }
                case EXIT -> exit = false;
                default -> System.out.println("REPEAT INPUT!\n");
            }
        }
    }
}
