package clases;

// CONCRETE BUILDER.
public class GuerreroBuilder extends PjBuilder {
    @Override
    public void buildNombre() { 
        pj.setNombre("varian"); 
    }
    
    @Override
    public void buildGenero() { 
        pj.setGenero("masculino"); 
    }
    
    @Override
    public void buildRaza() { 
        pj.setRaza("Humano"); 
    }

    @Override
    public void buildEspecializacion() {
        pj.setRaza("furia");
    }
}
