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

    public void setNombrecientifico(String Nombrecientifico) {
        this.Nombrecientifico = Nombrecientifico;
    }

    public String getNombreComun() {
        return NombreComun;
    }

    public void setNombreComun(String NombreComun) {
        this.NombreComun = NombreComun;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public String getRasgos() {
        return rasgos;
    }

    public void setRasgos(String rasgos) {
        this.rasgos = rasgos;
    }

    public String getDistribucion() {
        return distribucion;
    }

    public void setDistribucion(String distribucion) {
        this.distribucion = distribucion;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return "Animales{" + "Nombrecientifico=" + Nombrecientifico + ", NombreComun=" + NombreComun + ", habitat=" + habitat + ", alimentacion=" + alimentacion + ", rasgos=" + rasgos + ", distribucion=" + distribucion + ", vida=" + vida + '}';
    }

    
    
}
