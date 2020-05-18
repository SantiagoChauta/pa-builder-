package clases;

// ABSTRACT BUILDER.
public abstract class PjBuilder {
    protected pj pj;
 
    public pj getPj() { 
        return pj; 
    }
    
    public void crearNuevoPj() { 
        pj = new pj(); 
    }
 
    public abstract void buildNombre();
    public abstract void buildGenero();
    public abstract void buildRaza();
    public abstract void buildEspecializacion();
    
}
