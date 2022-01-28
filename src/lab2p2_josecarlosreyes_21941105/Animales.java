/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2p2_josecarlosreyes_21941105;

/**
 *
 * @author josec
 */
public class Animales {
    private String Nombrecientifico;
    private String NombreComun;
    private String habitat;
    private String alimentacion;
    private String rasgos;
    private String distribucion;
    private int vida;
    
    public Animales(){
    }

    public Animales(String Nombrecientifico, String NombreComun, String habitat, String alimentacion, String rasgos, String distribucion, int vida) {
        this.Nombrecientifico = Nombrecientifico;
        this.NombreComun = NombreComun;
        this.habitat = habitat;
        this.alimentacion = alimentacion;
        this.rasgos = rasgos;
        this.distribucion = distribucion;
        this.vida = vida;
    }

    public String getNombrecientifico() {
        return Nombrecientifico;
    }

    public String getNombreComun() {
        return NombreComun;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public String getRasgos() {
        return rasgos;
    }

    public String getDistribucion() {
        return distribucion;
    }

    public int getVida() {
        return vida;
    }

    @Override
    public String toString() {
        return "Animales{" + "Nombrecientifico=" + Nombrecientifico + ", NombreComun=" + NombreComun + ", habitat=" + habitat + ", alimentacion=" + alimentacion + ", rasgos=" + rasgos + ", distribucion=" + distribucion + ", vida=" + vida + '}';
    }
    
    
}
