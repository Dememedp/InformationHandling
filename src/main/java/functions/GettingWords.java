package functions;

import java.util.ArrayList;
import java.util.Locale;

public class GettingWords {
    ArrayList<String> words = new ArrayList<>();
    GettingSentences sent = new GettingSentences();
    ArrayList<String> sentences = new ArrayList<>(sent.getSentences());

    public ArrayList<String> getWords(){
        words();
        return words;
    }

    public void words(){
        for (String sentence : sentences) {
            for (String word : sentence.split("\\s")){
                if (!word.equals("")){
                    if (word.charAt(word.length() - 1) == ',' || word.charAt(word.length() - 1) == '\n'){
                        word  = word.substring(0, word.length() - 1);
                    }
                    words.add(word.toLowerCase(Locale.ROOT));
                }
            }
        }
    }

    public void printWords(){
        words();
        System.out.println(words.size());
        for (String word : words){
            System.out.println(word);
        }
    }
}
