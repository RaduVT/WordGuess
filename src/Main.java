import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        MagicWord m = new MagicWord();
        boolean gameOver = false;
        Scanner input = new Scanner(System.in);
        System.out.println(m);
        while(!gameOver) {
            System.out.println("Enter letter or word");
            String s = input.next();
            m.shootLetterOrWord(s);
            System.out.println(m);
            if (m.wins()) {
                System.out.println("You win");
                gameOver = true;
            }
        }
    }
}
