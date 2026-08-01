package modelo;

import javax.swing.JOptionPane;
import modelo.Dueño;
public class Mascota {
    
    //Atributos
    private String nombre;
    private int edad;
    private double peso;
    private String especie;
    private String raza;
    private Dueño dueño;
    
    //Constructores
    public Mascota(String nombre, int edad, double peso, String especie, String raza, Dueño dueño){
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.especie = especie;
        this.raza = raza;
        this.dueño = dueño;
    }
    
    // Getters y Setters
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setEdad(int edad){
        if(edad>=0){
            this.edad = edad;
        } else {
            JOptionPane.showMessageDialog(null, "Error,la edad no puede ser negativa.");
        }
    }
    
    public double getPeso(){
        return peso;
    }
    
    public void setPeso(double peso){
        if(peso>=0){
            this.peso = peso;
        } else {
            JOptionPane.showMessageDialog(null, "Error,El peso no puede ser negativo.");
        }
       
    }
    
    public String getEspecie(){
        return especie;
    }
    
    public void setEspecie(String especie){
        this.especie = especie;
    }
    
    public String getRaza(){
        return raza;
    }
    
    public void setRaza(String raza){
        this.raza = raza;
    }
    
    public Dueño getDueño(){
        return dueño;
    }
    
    public void setDueño(Dueño dueño){
        this.dueño = dueño;
    }
} 