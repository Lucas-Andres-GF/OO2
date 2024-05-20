package ar.edu.info.unlp.ejercicio21;

import java.time.LocalDate;

public class Mamifero {
    private Mamifero madre; 
    private Mamifero padre;
    private String identificador; 
    private String especie; 
    private LocalDate fechaNacimiento;

    public Mamifero(String identificador, String especie, LocalDate fechaNacimiento) {
        this.identificador = identificador;
        this.especie = especie;
        this.fechaNacimiento = fechaNacimiento;
        this.madre = null; 
        this.padre = null; 
    }

    public Mamifero getPadre() {
        return this.padre; 
    }

    public Mamifero getMadre() {
        return this.madre; 
    }

    public void setPadre(Mamifero padre) {
        this.padre = padre;
    }

    public void setMadre(Mamifero madre) {
        this.madre = madre;
    }

    public Mamifero getAbueloMaterno() {        
        return this.madre.getPadre(); 
    }

    public Mamifero getAbuelaMaterna() {
        return this.madre.getMadre(); 
    }

    public Mamifero getAbueloPaterno() {
        return this.padre.getPadre(); 
    }

    public Mamifero getAbuelaPaterna() {
        return this.padre.getMadre(); 
    }

    public boolean tieneComoAncestro(Mamifero unMamifero){
        if (this.padre == null && this.madre == null) {
            return false;
        }
        if (this.padre == unMamifero || this.madre == unMamifero) {
            return true;
        } else {
            if (this.padre != null)
                return this.padre.tieneComoAncestro(unMamifero);
            else if (this.madre != null)
                return this.madre.tieneComoAncestro(unMamifero);
            else
                return false;
        }    
    }

    public String getEspecie() {
        return especie;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getIdentificador() {
        return identificador;
    }
}
