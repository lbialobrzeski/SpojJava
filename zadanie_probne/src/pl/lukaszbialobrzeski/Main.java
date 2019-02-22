package pl.lukaszbialobrzeski;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int suma;

        Scanner pScanner = new Scanner(System.in);

        suma = pScanner.nextInt();
        suma +=pScanner.nextInt();
        System.out.println(suma);
    }
}
