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
public class Futbolista extends Seleccion {
   private int dorsal;
   private String posicion;

   public Futbolista (){
     super ();  
   public Futbolista (int id, String Nombre, String Apellido, int edad, String posicion, int dorsal){
     super (Nombre, Apellido, id, edad);  
     this.dorsal = dorsal;
     this.posicion = posicion;
   }
   public void jugar_partido (){

       System.out.println("Jugando el partido");
   }
   public void entrenar (){

       System.out.println("Entrenando");
   }

   public void recibir_masaje(){
       System.out.println("Recibe el masaje");
   }

    public int getDorsal() {
