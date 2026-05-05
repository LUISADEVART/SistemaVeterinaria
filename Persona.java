public class Persona {

    private String nombre;
    private int telefono;
    private String direccion;

    public Persona(String nombre, int telefono, String direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public void MostrarInfo() {
        System.out.println("El nombre del usuario ingresado es: " + nombre);
        System.out.println("El telefono es: " + telefono);
        System.out.println("La direccion es: " + direccion);
    }
}
