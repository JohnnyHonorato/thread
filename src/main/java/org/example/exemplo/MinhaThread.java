package org.example.exemplo;

public class MinhaThread implements Runnable {

    private String nome;

    private int tempo;

    public MinhaThread(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
    }

    @Override
    public void run() {
        try {
        for (int i = 0; i <= 6; i++) {
            System.out.println(nome + " contador: " + i);
            Thread.sleep(tempo);
        }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(nome + " Terminou a execucao");
    }

}
