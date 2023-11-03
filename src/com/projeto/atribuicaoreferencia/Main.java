package com.projeto.atribuicaoreferencia;

public class Main{
    public static void main(String[] args){
        int intA = 1;
        int intB = intA;
        System.out.println("IntA " + intA + "| IntB " + intB);
        intA = 2;
        System.out.println("IntA " + intA + "| IntB " + intB);

        MeuObj objeto = new MeuObj(2);
        System.out.println(objeto);
        MeuObj objetoB = objeto;
        System.out.println("Obj " + objeto + "| ObjB " + objetoB);
    }
}