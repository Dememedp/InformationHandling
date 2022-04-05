package functions;

import java.util.ArrayList;

public class TheLongestWord {
    GettingSentences sent = new GettingSentences();
    ArrayList<String> sentences = new ArrayList<>(sent.getSentences());
    String longestWord = "";
    String longestWordSentence = "";

    public void findLongestWord(){
        for (String sent : sentences){
            for (String word : sent.split("\\s")){
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                    longestWordSentence = sent;
                }
            }
        }
        sentences.remove(longestWordSentence);
    }

    public String getLongestWord(){
        findLongestWord();
        return longestWord;
    }

    public void printTheLongestWord(){
        findLongestWord();
        System.out.println("The longest word is \"" + longestWord + "\"");
        System.out.println("We deleted this sentence:\n" + longestWordSentence + ".\n");
    }
}
