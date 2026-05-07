import java.time.LocalDate;

public class Cliente extends Persona{
    private String idCliente;
    private LocalDate fechaRegistro;
    private int cantidadMascotas;
    

    public Cliente(String nombre, String telefono, String direccion, String tipoPersona, String idCliente, LocalDate fechaRegistro, int cantidadMascotas)
    {
       

        super(nombre, telefono, direccion,"natural");
        this.idCliente = idCliente;
        this.fechaRegistro = fechaRegistro;
        this.cantidadMascotas = 0;
 
    }
    @Override
    public void  mostrarInfo()
    {
        System.out.println("INFORMACION DEL CLIENTE");
        System.out.println("ID CLIENTE: " + idCliente);
        System.out.println("Nombre: " + getNombre());
        System.out.println("Telefono: " + getTelefono());
        System.out.println("Dirección: " + getDireccion());
        System.out.println("Tipo de persona: " + getTipoPersona());
        System.out.println("Fecha" + fechaRegistro);

    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public int getCantidadMascotas() {
        return cantidadMascotas;
    }

    public void setCantidadMascotas(int cantidadMascotas) {
        this.cantidadMascotas = cantidadMascotas;
    }

    public void agregarMascota() {
        this.cantidadMascotas++;
    }
}