package clases;

// CLASE PRODUCTO.
public class pj {
    private String nombre = "";
    private String genero = "";
    private String raza = "";
    private String especializacion="";
 
    public void setNombre(String nombre) { 
        this.nombre = nombre; 
        System.out.println(nombre);
    }
    
    public void setGenero(String genero) { 
        this.genero = genero; 
        System.out.println(genero);
    }
    
    public void setRaza(String raza) { 
        this.raza = raza;
        System.out.println(raza);
    }

    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
        System.out.println(especializacion);
    }
    
   
    
}
