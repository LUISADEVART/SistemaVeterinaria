import java.util.Scanner;

public interface IEmpleado {

    void registrarEmpleado(Scanner scanner);

    void mostrarDatosEmpleado();

    void actualizarDatosEmpleado(String campo, Object nuevoValor);
}
