package clases;

// CLASE DIRECTOR.
public class Creacion {
    private PjBuilder pjBuilder;
 
    public void setPjBuilder(PjBuilder pb) { 
        pjBuilder = pb; 
    }
    
    public pj getPj() { 
        return pjBuilder.getPj(); 
    }
 
    public void construirPJ() {
       pjBuilder.crearNuevoPj();
       pjBuilder.buildNombre();
       pjBuilder.buildGenero();
       pjBuilder.buildRaza();
       pjBuilder.buildEspecializacion();
    }
}
