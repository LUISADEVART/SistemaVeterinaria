import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cliente extends Persona implements ICliente {

    private String idCliente;
    private LocalDate fechaRegistro;
    private final List<Mascota> mascotas = new ArrayList<>();

    public Cliente(String nombre, String telefono, String direccion, String tipoPersona,
                   String idCliente, LocalDate fechaRegistro, int cantidadMascotas) {
        super(nombre, telefono, direccion, tipoPersona);
        this.idCliente = idCliente;
        this.fechaRegistro = fechaRegistro;
    }

    @Override
    public void registrarCliente() {
        System.out.println("Cliente registrado: " + getNombre());
    }

    @Override
    public void mostrarDatosCliente() {
        System.out.println("INFORMACION DEL CLIENTE");
        System.out.println("ID CLIENTE: " + idCliente);
        System.out.println("Nombre: " + getNombre());
        System.out.println("Telefono: " + getTelefono());
        System.out.println("Dirección: " + getDireccion());
        System.out.println("Tipo de persona: " + getTipoPersona());
        System.out.println("Fecha registro: " + fechaRegistro);
        System.out.println("Cantidad de mascotas: " + mascotas.size());
    }

    @Override
    public void actualizarDatosCliente(String campo, Object nuevoValor) {
        if (nuevoValor == null) {
            return;
        }
        switch (campo.toLowerCase()) {
            case "nombre":
                setnombre((String) nuevoValor);
                break;
            case "telefono":
                setTelefono((String) nuevoValor);
                break;
            case "direccion":
                setDireccion((String) nuevoValor);
                break;
            case "tipopersona":
                setTipoPersona((String) nuevoValor);
                break;
            case "idcliente":
                this.idCliente = (String) nuevoValor;
                break;
            case "fecharegistro":
                this.fechaRegistro = (LocalDate) nuevoValor;
                break;
            default:
                System.out.println("Campo no reconocido: " + campo);
        }
    }

    @Override
    public void agregarMascota(Mascota mascota) {
        if (mascota != null) {
            mascotas.add(mascota);
            System.out.println("Mascota agregada: " + mascota.getNombre());
        }
    }

    @Override
    public void eliminarMascota(String nombreMascota) {
        boolean eliminada = mascotas.removeIf(
                m -> m.getNombre().equalsIgnoreCase(nombreMascota));
        if (eliminada) {
            System.out.println("Mascota eliminada: " + nombreMascota);
        } else {
            System.out.println("No se encontró la mascota: " + nombreMascota);
        }
    }

    @Override
    public List<Mascota> getMascotas() {
        return new ArrayList<>(mascotas);
    }

    @Override
    public void mostrarMascota() {
        if (mascotas.isEmpty()) {
            System.out.println("El cliente no tiene mascotas registradas.");
            return;
        }
        for (Mascota m : mascotas) {
            m.mostrarInfo();
        }
    }

    public int getCantidadMascotas() {
        return mascotas.size();
    }

    public String getIdCliente() {
        return idCliente;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}
