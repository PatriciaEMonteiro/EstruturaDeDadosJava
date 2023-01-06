package com.projeto.atribuicaoreferencia;

// Para analisar forma de referênciação/atribuições de variáveis na memória
public class Main {

    public static void main(String[] args){

        // Tipos primitivos: copia-se o valor em memoria.
        int intA = 1;
        int intB = intA;
        System.out.println("Inteiro A = " + intA + "\nInteiro B = " + intB);

        intA = 2;
        System.out.println("Inteiro A = " + intA + "\nInteiro B = " + intB);



        // Chamando/Testanto objetos.
        MeuObj objA = new MeuObj(1);
        MeuObj objB = objA;
        System.out.println("Objeto A = " + objA + "\nObjeto B = " + objB);

        objA.setNum(2);
        System.out.println("Objeto A = " + objA + "\nObjeto B = " + objB);


    }

}
