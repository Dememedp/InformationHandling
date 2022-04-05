package functions;

import java.util.ArrayList;

public class GettingSentences {
    FileWork work = new FileWork();
    ArrayList<Character> text = new ArrayList<>(work.getText());
    private ArrayList<String> sentences = new ArrayList<>();

    public void sentences(){
        String fullText = "";
        for (Character character : text) {
            if (character != '\n'){
                fullText += character.toString();
            }
        }

        for (String s : fullText.split("\\.")){
            if (s.charAt(0) == ' '){
                s = s.substring(1);
            }
            sentences.add(s);
        }
    }

    public ArrayList<String> getSentences(){
        sentences();
        return sentences;
    }
}
