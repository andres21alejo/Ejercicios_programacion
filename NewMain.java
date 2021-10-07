/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author User
 */
public class NewMain  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Automoviles auto[] = new Automoviles[4];

        auto[0] = new Automoviles ("HP3032", "BMW", "2016");
        auto[1] = new Turista ("HP30301", "Toyota", "2018", 4);
        auto[2] = new Deportivo ("Hp4042", "Ferrari", "2021", 4);
        auto[3] = new Furgoneta ("GH201", "Mercedes Benz", "2000", 230);
        for (Automoviles auto2 : auto){
            System.out.println(auto2.mostrardatos());
            System.out.println("");
        }
    }

}
