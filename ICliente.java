import java.util.List;
import java.util.Scanner;

public interface ICliente{

    void registrarCliente(Scanner scanner);
    void mostrarDatosCliente();
    void actualizarDatosCliente(String campo, Object nuevoValor);
    void eliminarMascota(String nombreMascota);
    void agregarMascota(Mascota mascota);

    List<Mascota> getMascotas();

    void mostrarMascota();


}
