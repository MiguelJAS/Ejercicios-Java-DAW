package javaapplication34;

import java.util.*;

public class JavaApplication34 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int intentos = 0;
        int numLetrasAcertadas = 0;
        System.out.println("Introduce la palabra a buscar: ");
        String incognita = sc.nextLine();
        char[] arrayIncognita = incognita.toCharArray();
        char[] conversionIncognita = new char[arrayIncognita.length];
        while (intentos < 5) {
            char letra = sc.next().charAt(0);
            for (int i = 0; i < arrayIncognita.length; i++) {
                if (letra == arrayIncognita[i]) {
                    conversionIncognita[i] = letra;
                    numLetrasAcertadas++;
                }
            }
            intentos++;
        }
        for (int i = 0; i < conversionIncognita.length ; i++) {
            if(conversionIncognita[i] == 0){
                conversionIncognita[i] = '_';
            }
        }
        for (int i = 0; i < conversionIncognita.length; i++) {
            System.out.print(conversionIncognita[i] + " ");
        }
        System.out.println("");
        System.out.println("El numero de letras acertadas es de : " + numLetrasAcertadas);
    }
}
