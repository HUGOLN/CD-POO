package com.campusdual;

public class Exercise4 {

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        int sum5 = numeros[0] + numeros[1] + numeros[2] + numeros[3] + numeros[4];

        int sum20P =
                numeros[1] + numeros[3] + numeros[5] + numeros[7] + numeros[9] +
                        numeros[11] + numeros[13] + numeros[15] + numeros[17] + numeros[19] +
                        numeros[21] + numeros[23] + numeros[25] + numeros[27] + numeros[29] +
                        numeros[31] + numeros[33] + numeros[35] + numeros[37] + numeros[39];

        // Imprimir las sumas
        System.out.println("Suma de los primeros 5 números: " + sum5);
        System.out.println("Suma de los primeros 20 números pares: " + sum20P);
    }

}

