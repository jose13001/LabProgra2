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
            editar();
        else if(opcion == 3)
            eliminardatos();
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
    
    public static void editar(){
        System.out.print("Ingrese Nombre Cientifico: ");
        int nombrec = sc.nextInt();
        System.out.println("1. Un atributo");
        System.out.println("2. Todos los atributos");
        System.out.print("Ingrese la opcion: ");
        int opcion = sc.nextInt();
        if(opcion == 1)
            editarUnAtributo(nombrec);
        else if(opcion == 2)
            editarAtributos(nombrec);
    }
    public static void editarUnAtributo(int nombrec){
        System.out.println("1. Nombre comun");
        System.out.println("2. Habitat");
        System.out.println("3. Alimentacion");
        System.out.println("4. Rasgos");
        System.out.println("5. Distribucion geografica");
        System.out.println("6. Vida");
        System.out.print("Ingrese la opcion: ");
        int opcion = sc.nextInt();
        if(opcion == 1){
            System.out.print("Nombre comun: ");
            lista.get(nombrec).setNombreComun(sc.next());
        }else if(opcion == 2){
            System.out.print("Habitat: ");
            lista.get(nombrec).setHabitat(sc.next());
        }else if(opcion == 3){
            System.out.print("Alimentacion: ");
            lista.get(nombrec).setAlimentacion(sc.next());
        }else if(opcion == 4){
            System.out.println("Rasgos: ");
            lista.get(nombrec).setRasgos(sc.next());
        }else if(opcion == 5){
            System.out.print("Distribucion geografica: ");
            lista.get(nombrec).setDistribucion(sc.next());
        }else if(opcion == 6){
            System.out.print("Vida: ");
            lista.get(nombrec).setVida(sc.nextInt());
        }
    }
    public static void editarAtributos(int nombrec){
        System.out.print("Nombre comun: ");
        lista.get(nombrec).setNombreComun(sc.next());
        System.out.print("Habitat: ");
        lista.get(nombrec).setHabitat(sc.next());
        System.out.print("Alimentacion: ");
            lista.get(nombrec).setAlimentacion(sc.next());
       System.out.println("Rasgos: ");
            lista.get(nombrec).setRasgos(sc.next());
        System.out.print("Distribucion geografica: ");
            lista.get(nombrec).setDistribucion(sc.next());
        System.out.print("Vida: ");
            lista.get(nombrec).setVida(sc.nextInt());       
    }
    public static void eliminardatos(){
        System.out.print("Nombre Cientifico: ");
        lista.remove(sc.nextInt());
    }
    



    
}
