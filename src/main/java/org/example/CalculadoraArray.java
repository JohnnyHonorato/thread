package org.example;

public class CalculadoraArray {

    private int soma = 0;

    public synchronized int somaArray(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
            System.out.println("Executando a soma " + Thread.currentThread().getName() +
                    " somando o valor " + numeros[i] + " com total de " + soma);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return soma;
    }

}
