package KagenBushi;
import java.util.Scanner;

public class Jutsu{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;
        while (sc.hasNext()) {
            N = sc.nextInt();
            System.out.println((int)(Math.log( N   )/Math.log(  2 )));
        }

        sc.close();
    }
}
