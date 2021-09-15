package ex01;

public class ToLowerCase {

    public static String lower(String mot) {
        
        return mot.toLowerCase();
    }

    public static void main(String[] args) {
        String mot = "Hello";
        System.out.println(lower(mot));
    }
    
}
