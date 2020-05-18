package clases;

// CONCRETE BUILDER.
public class ChamanBuilder extends PjBuilder {
    @Override
    public void buildNombre() { 
        pj.setNombre("Thrall"); 
    }
    
    @Override
    public void buildGenero() { 
        pj.setGenero("masculino"); 
    }
    
    @Override
    public void buildRaza() { 
        pj.setRaza("orco"); 
    }

    @Override
    public void buildEspecializacion() {
        pj.setRaza("elemental");
    }
}
