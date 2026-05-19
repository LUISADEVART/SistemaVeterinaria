import java.util.List;

public interface ICliente{

    void registrarCliente();
    void mostrarDatosCliente();
    void actualizarDatosCliente(String campo, Object nuevoValor);
    void eliminarMascota(String nombreMascota);
    void agregarMascota(Mascota mascota);

    List<Mascota> getMascotas();

    void mostrarMascota();


}
