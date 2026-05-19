public class Persona {

    protected String nombre;
    protected String telefono;
    protected String direccion;
    protected String tipoPersona;

    public Persona(String nombre, String telefono, String direccion, String tipoPersona) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.tipoPersona = tipoPersona;
    }
 
 //geters
    public String getNombre(){
    return nombre;
    }
    public String getTelefono(){
    return telefono;
    }

    public String getDireccion(){
    return direccion;
    }

    public String getTipoPersona(){
    return tipoPersona;
    }

//seters
    public void setnombre(String nombre){
        this.nombre = nombre;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;

    }
    public void setDireccion(String direccion){
        this.direccion = direccion;

    }
        public void setTipoPersona(String tipoPersona){
        this.tipoPersona = tipoPersona;

    }

}
