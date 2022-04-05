package functions;

import java.util.ArrayList;

public class DeleteSentences {
    GettingSentences sent = new GettingSentences();
    ArrayList<String> sentences = new ArrayList<>(sent.getSentences());
    int delCount = 0;

    public void deleteSentences(int wordAmount){
        ArrayList<String> del = new ArrayList<>();
        for (String sentence : sentences){
            int wordCount = 0;
            for (String word : sentence.split("\\s")){
                wordCount++;
            }
            if (wordCount < wordAmount){
                del.add(sentence);
                delCount++;
            }
        }
        for (String s : del){
            sentences.remove(s);
        }
    }

    public void printDeletedSentences(int amount){
        deleteSentences(amount);
        System.out.println("We deleted " + delCount + " sentences.");
        for (String sent : sentences){
            System.out.println(sent + ".");
        }
        System.out.println();
    }

    public int getDeletedSentencesAmount(int amount){
        deleteSentences(amount);
        return delCount;
    }
}
