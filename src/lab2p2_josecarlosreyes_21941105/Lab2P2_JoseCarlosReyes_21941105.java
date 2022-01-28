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
          opciones(menu());
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
    
    public static void opciones(int opcion){
        if(opcion == 0)
            System.exit(0);
        else if(opcion == 1)
            registrar();
        else if(opcion == 2)
            ();
        else if(opcion == 3)
            ();
        else if(opcion == 4)
            ();
        else if(opcion == 5)
            ();
    }
    
    public static void registrar(){
        System.out.print("Nombre Cientifico: ");
        String Nombrecientifico = sc.nextLine();
        System.out.print("Nombre Comun: ");
        String NombreComun = sc.nextLine();
        System.out.print("Habitat: ");
        String habitat = sc.nextLine();
        System.out.print("Alimentacion: ");
        String alimentacion = sc.nextLine();
        System.out.print("Rasgos: ");
        String rasgos = sc.nextLine();
        System.out.print("Distribucion Geografica: ");
        String distribucion = sc.nextLine();
        System.out.print("Vida: ");
        int vida = sc.nextInt();
        lista.add(new Animales(Nombrecientifico, NombreComun, habitat, alimentacion, rasgos,
        distribucion, vida));
    }
    
}
