import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class JavaScanners {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(System.in); //system input

        String myNextWord = s.next();
        System.out.println(myNextWord);
        int myNextNumber = s.nextInt();
        long myNextLong = s.nextLong();
        s.close();

        Scanner sc = new Scanner(new File("myTextFile"));
        while (sc.hasNext()) {
            String nextWord = sc.next();
            System.out.println(nextWord);
        }

    }
}
