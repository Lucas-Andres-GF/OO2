package ar.edu.info.unlp.ejercicio21;

public class MamiferoNull extends Mamifero {
    public MamiferoNull() {  
        super(null, null, null);      
    }

    @Override
    public boolean tieneComoAncestro(Mamifero unMamifero) {
        return false;
    }

    @Override
    public Mamifero getPadre() {
        return null;
    }

    @Override
    public Mamifero getMadre() {
        return null;
    }
}
