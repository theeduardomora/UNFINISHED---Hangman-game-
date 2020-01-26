import java.util.HashMap;

public class WordGenerator {
    String[] wordlist = {" word", "examine", " omniscient", "count", "hallowed", "doll",
            "rose", "coil", "better", "children", "mourn", "inexpensive", "flippant"};
    public String revealwordlist;

    HashMap<Integer, String> guessingwords = new HashMap<Integer, String>();

    public WordGenerator() {
        for (int i = 1; i <= wordlist.length; i++) {
            guessingwords.put(i, wordlist[i]);
        }
    }

    public void GenWord() {
        int aaaa = (int) (Math.random() * 12) + 1;
        revealwordlist = guessingwords.get(aaaa);
        //  for(int mm = 0; mm < revealwordlist.length(); mm++) {


    }
}
