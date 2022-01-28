/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2p2_josecarlosreyes_21941105;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author josec
 */
public class Lab2P2_JoseCarlosReyes_21941105 {

    /**
     * @param args the command line arguments
     */
    public static ArrayList<Animales> lista = new ArrayList();
    public static Scanner sc = new Scanner(System.in);
    public static Animales Registrados = new Animales();
    


    public static void main(String[] args) {
        // TODO code application logic here
       do{
           menu();
       }
       while (true);
        
    }
    public static int menu(){
        System.out.println("");
        System.out.println("");
        System.out.println("0. Salir");
        System.out.println("1. Registrar Animal\n" +
                            "2. Editar datos del animal\n" +
                            "3. Eliminar datos del animal\n" +
                            "4. Imprimir lista\n" +
                            "5. Alimentar animal\n" +                           
                            "Ingrese la opcion: ");
        return sc.nextInt();

    }
    
}
