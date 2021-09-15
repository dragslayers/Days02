package ex02;

public class RomainToInt {
    public static void main(String[] args) {
        
        int nombre = 0;
        for (int i = 0; i < args[0].length(); i++) {
            if (i != args[0].length()-1 && (args[0].charAt(i) == 'I' && args[0].charAt(i + 1) == 'V')) {
                nombre += 4;
                i++;
            } else if (i != args[0].length()-1 && (args[0].charAt(i) == 'I' && args[0].charAt(i + 1) == 'X')) {
                nombre += 9;
                i++;
            } else if (i != args[0].length()-1 && (args[0].charAt(i) == 'X' && args[0].charAt(i + 1) == 'L')) {
                nombre += 40;
                i++;
            } else if (i != args[0].length()-1 && (args[0].charAt(i) == 'X' && args[0].charAt(i + 1) == 'C')) {
                nombre += 90;
                i++;
            } else if (i != args[0].length()-1 && (args[0].charAt(i) == 'C' && args[0].charAt(i + 1) == 'D')) {
                nombre += 400;
                i++;
            } else if (i != args[0].length()-1 && (args[0].charAt(i) == 'C' && args[0].charAt(i + 1) == 'M')) {
                nombre += 900;
                i++;
            } else {

                switch (args[0].charAt(i)) {
                    case 'I':
                        nombre += 1;
                        break;
                    case 'V':
                        nombre += 5;
                        break;
                    case 'X':
                        nombre += 10;
                        break;
                    case 'L':
                        nombre += 50;
                        break;
                    case 'C':
                        nombre += 100;
                        break;
                    case 'D':
                        nombre += 500;
                        break;
                    case 'M':
                        nombre += 1000;
                        break;
                }
            }
        }

        System.out.println(nombre);

    }
}
