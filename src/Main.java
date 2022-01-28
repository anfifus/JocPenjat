import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String word = null;

	     word = createWord();//This will create the word we will use to play

        showHiddenWord(word);
    }

    private static void showHiddenWord(String word) {
        System.out.println("This is the word: ");
        for(int cont = 0; cont < word.length();cont++)
        {
            System.out.print("_");
        }
    }

    private static String createWord() {
        System.out.println("Create the word: ");
        Scanner sc = new Scanner(System.in);
        String word;

        word = sc.next();
        return word;
    }


}
