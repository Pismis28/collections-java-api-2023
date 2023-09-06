package main.java.List.OperacoesBasicas.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    //atributos
    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.numeros.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        for (Integer numero : numeros)
            soma += numero;
        return soma;

    }
    public int encontrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;
        if (!numeros.isEmpty()) {
            for (Integer numero : numeros) {
                if (numero >= maiorNumero) {
                    maiorNumero = numero;
                }
            }
            return maiorNumero;
        } else {
            throw new RuntimeException("A lista esta vazia!");
        }
    }
    public int encontrarMenorNumero() {
        int menorNumero = Integer.MAX_VALUE;
        if (!numeros.isEmpty()) {
            for (Integer numero : numeros) {
                if (numero <= menorNumero) {
                    menorNumero = numero;
                }
            }
            return menorNumero;
        } else {
            throw new RuntimeException("A lista esta vazia!");
        }
    }
    public void exibirNumeros(){
        if (!numeros.isEmpty()){
            System.out.println(this.numeros);
        } else {
            System.out.println("A lista esta vazia!");
        }
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(-2);
        somaNumeros.adicionarNumero(10);

        System.out.println("Numeros adicionados");
        somaNumeros.exibirNumeros();

        System.out.println("Soma dos numeros =" + somaNumeros.calcularSoma());

        System.out.println("O maior numero da lista eh: " + somaNumeros.encontrarMaiorNumero());

        System.out.println("O menor numero da lista eh: " + somaNumeros.encontrarMenorNumero());
    }
}
