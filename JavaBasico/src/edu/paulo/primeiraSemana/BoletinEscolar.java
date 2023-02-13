package edu.paulo.primeiraSemana;
public class BoletinEscolar {
    public static void main(String[] args) {
        int mediaFinal = 9;
        if (mediaFinal < 9) {
            System.out.println("Reprovador");
        } else if (mediaFinal == 9) {
            System.out.println("Prova de Minerva");
        } else {
            System.out.println("Aprovado");
        }
    }
}