package org.example;

public class MinhaTheadSoma implements Runnable {

    private String nome;

    private int[] nums;

    private static CalculadoraArray calc = new CalculadoraArray();

    public MinhaTheadSoma(String nome, int[] nums) {
        this.nome = nome;
        this.nums = nums;
        new Thread(this, nome).start();
    }

    @Override
    public void run() {
        System.out.println(this.nome + " iniciada");
        int soma = calc.somaArray(this.nums);
        System.out.println("Resultado da soma para thread " + this.nome + " e: " + soma);
        System.out.println(this.nome + " terminou");
    }
}
