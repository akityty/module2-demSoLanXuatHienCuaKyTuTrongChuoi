import java.util.Scanner;
import java.io.IOException;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = ",cer8c957qnnrsdjhfc475coimjsdflkns8r";
        System.out.println("Input character:");
        char character = 0;
        try {
            character = (char) System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int count = 0;
        for(int i = 0; i< string.length();i++){
            if (string.charAt(i) == character) {
                count++;
            }
        }
        System.out.println(count);
    }
}
