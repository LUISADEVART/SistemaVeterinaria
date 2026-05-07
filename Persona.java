public abstract class Persona {

    private String nombre;
    private int telefono;
    private String direccion;
    private String tipoPersona;

    public Persona(String nombre, int telefono, String direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.tipoPersona = tipoPersona;
    }

    public void MostrarInfo() {
        System.out.println("El nombre del usuario ingresado es: " + nombre);
        System.out.println("El telefono es: " + telefono);
        System.out.println("La direccion es: " + direccion);
        System.out.println("El tipo de persona es " + tipoPersona);
    }
}
