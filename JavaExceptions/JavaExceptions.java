package JavaExceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class JavaExceptions {

    public static void main(String[] args) {
        ourOwnException();
    }

    public static void methodThatThrowsAnException(){
        int[] myNumbers = {1,2,3};
        System.out.println(myNumbers[5]);
    }

    public static void methodThatCatchesArrayIndexOutOfBoundsException(){
        try {
            int[] myNumbers = {1,2,3};
            System.out.println(myNumbers[5]);
        } catch (NullPointerException e) {
            System.out.println("Exception caught");
        } finally {
            System.out.println("WE ARE IN THE FINALLY BLOCK");
        }
    }

    public static void checkedException() throws FileNotFoundException{
        Scanner s = new Scanner(new File("fakeFile"));
    }

    public static void ourOwnException() {
        try{
            if (true){
                throw new Exception("This is our exception");
            }
        } catch (Exception e){
            System.out.println("Our own exception");
        }
    }
}
