import java.util.Set;
import java.util.TreeSet;
import java.util.*;
public class Anagrams2 {
    /*
    private Set<String> n;
    private Set<String> words;
    private LetterInventory s;
    private LetterInventory li;
    private Set<String> solutionSet = new TreeSet<>();
    //Constructor initializes a Set with all of the words of the dictionary
    public Anagrams(Set<String> dictionary){
        this.n = dictionary;
    }

    public void print (String phrase){
        LetterInventory li = new LetterInventory(phrase);
        for (String g : getWords(li.toString())) {
            if (li.contains(g)) {
                solutionSet.add(g);
                li.subtract(g);
                if(li.isEmpty()){
                    System.out.print(solutionSet);
                    solutionSet.clear();
                } else {
                    print(li.toString());
                }
            }
        }
    }

    //Returns a Set with all of the words that match the dictionary with the given phrase
    public Set<String> getWords(String phrase){
        words = new TreeSet<>();
        if(phrase == null){
            throw new IllegalArgumentException();
        }
        //Letter Inventory s initially contains the phrase passed to the method
        LetterInventory s = new LetterInventory(phrase);
        for(String word : n) {
            if (s.contains(word)) {
                words.add(word);
            }
        }
        return words;
    }


    public void print(String phrase, int max){

    }

     */

}


