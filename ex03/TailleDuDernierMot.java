package ex03;

public class TailleDuDernierMot {

    public static void main(String[] args) {
        String[] mots = args[0].split(" ");
        System.out.println(mots[mots.length-1].length());
    }

}
