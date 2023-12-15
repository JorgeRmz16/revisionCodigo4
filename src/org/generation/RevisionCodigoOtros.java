package org.generation;

import java.util.Scanner; //  importar la clase Scanner

public class RevisionCodigoOtros {
    public static void main(String[] args) {
        //s -> sc
        Scanner sc = new Scanner(System.in); // System.in al constructor de Scanner

        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
        String jugador01 = sc.nextLine(); //cambio nombres

        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijera): ");//cambio a jugador 2
        //Scanner s2 = new Scanner(); se va
        String jugador02 = sc.nextLine();//cambio nombre

        if (jugador01.equals(jugador02)) { // == -> .equals
            System.out.println("Empate");
        } else {
            int ganador = 2; // g -> ganador
            switch(jugador01) {
                case "piedra":
                    if (jugador02.equals("tijeras")) {
                        ganador = 1;
                    }
                    break;
                case "papel":
                    if (jugador02.equals("piedra")) {
                        ganador = 1;
                    }
                    break;
                case "tijera": 
                    if (jugador02.equals("papel")) {
                        ganador = 1;
                    }
                    break;
                default:
            }
            System.out.println("Gana el jugador " + ganador);
        }
    }
}

