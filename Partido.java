/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author User
 */
public class Partido {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Seleccion integrantes [] = new Seleccion [3];
        Entrenador zizou = new Entrenador (1, "Zinadine", "Zinade", 49, 005);
        Masajista masajista = new Masajista (1, "Pablo", "De la cruz", 30, "Masajista", 5);
        Futbolista futbolista = new Futbolista (1, "Cristiano", "Ronaldo", 36, "Delantero centro", 7);

        integrantes [0] = zizou;
        integrantes [1] = masajista;
        integrantes [2] = futbolista;

        for (int i = 0; i < integrantes.length; i++){
            System.out.print(integrantes[i].getNombre() + " " + integrantes[i].getApellido() + " -> ");
            integrantes[i].Concentrarse();
        }
        System.out.println("\n Empieza el entrenamiento \n");
        System.out.print(zizou.getNombre() + " " + zizou.getApellido() + " -> ");
        zizou.Dirigir_entrenamiento();
        System.out.println(futbolista.getNombre() + " " + futbolista.getApellido() + " -> ");
        futbolista.entrenar();

            System.out.println("\n Empieza el partido \n");
            System.out.print(zizou.getNombre() + " " + zizou.getApellido() + " -> " );
            zizou.Dirigir_partido();
            System.out.print(futbolista.getNombre() + " " + futbolista.getApellido() + " -> ");
            futbolista.jugar_partido();

        System.out.println("\n Empieza el descanso postpartido \n");
        System.out.print(futbolista.getNombre() + " " + futbolista.getApellido() + " -> ");
        futbolista.recibir_masaje();
        System.out.print(masajista.getNombre() + " " + masajista.getApellido() + " -> ");
        masajista.dar_masaje();
    }

}
