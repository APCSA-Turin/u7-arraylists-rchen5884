package U7T3;
import java.util.ArrayList;



public class Runner {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();        
        words.add("candle");
        words.add("dandelion");
        words.add("eagle");
        words.add("garage");
        words.add("hamburger");
        words.add("imitate");
        words.add("jello");
       	
        // use a for loop here to print out the words in reverse order
        for (String word : words) {
            if (!word.substring(0,1).equals("h")) {
                System.out.println(word);
            }
            else {
                break;
            }
        }

    }
}
