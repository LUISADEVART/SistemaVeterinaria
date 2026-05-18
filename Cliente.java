import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Cliente extends Persona implements ICliente{
    private String idCliente;
    private LocalDate fechaRegistro;
    private int cantidadMascotas;
    private List<Mascota> mascotas = new ArrayList<>();


    public Cliente(String nombre, String telefono, String direccion, String tipoPersona, String idCliente, LocalDate fechaRegistro, int cantidadMascotas)
    {
       

        super(nombre, telefono, direccion,"natural");
        this.idCliente = idCliente;
        this.fechaRegistro = fechaRegistro;
        this.cantidadMascotas = 0;
 
    }


    @Override

     public void registrarCliente(){
        System.out.println("Cliente Registrado" + getNombre());
     }
    
     @Override
    public void mostrarDatosCliente(){
        System.out.println("INFORMACION DEL CLIENTE");
        System.out.println("ID CLIENTE: " + idCliente);
        System.out.println("Nombre: " + getNombre());
        System.out.println("Telefono: " + getTelefono());
        System.out.println("Dirección: " + getDireccion());
        System.out.println("Tipo de persona: " + getTipoPersona());
        System.out.println("Fecha" + fechaRegistro);
        System.out.println("Cantidad de mascotas" + mascotas.size());
    }

    @Override
    public void actualizarDatosCliente(String campo, Object nuevoValor){
        switch (campo){
            case "nombre": this.nombre =(String) nuevoValor;break;
            }
    }
    

    @Override
    public void agregarMascota(Mascota mascota) {this.cantidadMascotas++;}

    @Override
    public void eliminarMascota(String nombreMascota)
    {
        mascotas.removeIf(m->m.getNombre().equals(nombreMascota));
    }

    @Override
    public List<Mascota> getMascotas()
    {
        return mascotas;
    }
    @Override
    public void mostrarMascota()
    {

    }
    
    //get

    public String getIdCliente() { return idCliente; }
   

    public LocalDate getFechaRegistro() { return fechaRegistro;}


    public int getCantidadMascotas() { return cantidadMascotas;}


//set
    public void setCantidadMascotas(int cantidadMascotas) {this.cantidadMascotas = cantidadMascotas;}
 
    public void setIdCliente(String idCliente) {this.idCliente = idCliente;}

    public void setFechaRegistro(LocalDate fechaRegistro) {this.fechaRegistro = fechaRegistro;}

}