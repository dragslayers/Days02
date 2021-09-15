package ex00;

import java.util.Scanner;

public class PowerOfTwo {

    public static boolean square(int x) {
        //version très mathématique
        // return (Math.ceil((Math.log(x) / Math.log(2))))
        // == (Math.floor(((Math.log(x) / Math.log(2)))));
        if (x == 0) {
            return false;
        }

        while (x > 1) {
            if (x % 2 != 0) {
                return false;
            }
            x = x / 2;
        }
        return true;
    }

    public static void main(String[] args) {

        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez une valeur");
        x = sc.nextInt();

        if (square(x)) {
            System.out.println("true");
        } else {
            System.out.println("false");

        }

    }
}
