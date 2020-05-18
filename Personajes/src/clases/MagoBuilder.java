package clases;

// CONCRETE BUILDER.
public class MagoBuilder extends PjBuilder {
    @Override
    public void buildNombre() { 
        pj.setNombre("thalyssra"); 
    }
    
    @Override
    public void buildGenero() { 
        pj.setGenero("femenino"); 
    }
    
    @Override
    public void buildRaza() { 
        pj.setRaza("elfo natonocturno"); 
    }

    @Override
    public void buildEspecializacion() {
        pj.setEspecializacion("arcano");
    }
    
    
}
