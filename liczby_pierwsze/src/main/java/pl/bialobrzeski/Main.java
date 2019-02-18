package pl.bialobrzeski;

import java.util.Scanner;

/**
 * https://pl.spoj.com/problems/PRIME_T/
 */
public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        int pLiczbaLiczb = 0;

        Scanner pScanner = new Scanner(System.in);

        pLiczbaLiczb = pScanner.nextInt();

        int pLiczba = 0;
        int pLicznik = 0;

        for (int i = 0; i < pLiczbaLiczb; i++) {
            pLiczba = pScanner.nextInt();

            for (int j = 1; j <= pLiczba; j++) {
                if (pLiczba % j == 0) {
                    pLicznik++;
                }
            }
            if (pLicznik == 2) {
                System.out.println("TAK");
            } else {
                System.out.println("NIE");
            }
            pLicznik = 0;

        }
    }
}
