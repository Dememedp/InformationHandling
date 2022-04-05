package functions;

import java.util.ArrayList;

public class CountLetters {
    GettingWords word = new GettingWords();
    ArrayList<String> words = new ArrayList<>(word.getWords());
    int countVowels = 0, countConsonants = 0, countLetters = 0;

    public void countLetters(){
        char[] vowels = new char[]{'a', 'e', 'y', 'u', 'i', 'o'};
        for (String word : words){
            for (Character ch : word.toCharArray()){
                for (Character vowel : vowels){
                    if (ch == vowel){
                        countVowels++;
                    }
                }
                countLetters++;
            }
        }
        countConsonants = countLetters - countVowels;
        System.out.println("There are " + countVowels + " vowels and " + countConsonants + " consonants. " + countLetters + " letters.\n");
    }

    public int getCountLetters(){
        countLetters();
        return countLetters;
    }
}
