package functions;

import java.util.*;
import java.util.function.Function;

import static java.util.stream.Collectors.toMap;

public class SimilarWords {
    GettingWords word = new GettingWords();
    ArrayList<String> words = new ArrayList<>(word.getWords());
    Map<String, Long> frequency = words.stream().collect(toMap(Function.identity(), v -> 1L, Long::sum));

    public void findSimilarWords(){
        ArrayList<String> keys = new ArrayList<>();
        for (String key : frequency.keySet()){
           if (frequency.get(key) == 1){
                keys.add(key);
           }
        }
        for (String s : keys){
            frequency.remove(s);
        }
        Arrays.sort(frequency.keySet().toArray());
        System.out.println("Similar words:\n" + frequency + "\n");
    }

    public Long getLetterFrequency(String letter){
        findSimilarWords();
        return frequency.get(letter);
    }
}
