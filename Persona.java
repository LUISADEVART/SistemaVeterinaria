public abstract class Persona {

    private String nombre;
    private String telefono;
    private String direccion;
    private String tipoPersona;

    public Persona(String nombre, String telefono, String direccion, String tipoPersona) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.tipoPersona = tipoPersona;
    }
 

    public abstract void mostrarInfo();
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
    public void Setnombre(String nombre){
        this.nombre = nombre;
    }

    public void SetTelefono(String telefono){
        this.telefono = telefono;

    }
    public void SetDireccion(String direccion){
        this.direccion = direccion;

    }
        public void SetTipoPersona(String tipoPersona){
        this.tipoPersona = tipoPersona;

    }

}
