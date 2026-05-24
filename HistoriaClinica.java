import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class HistoriaClinica {

    private String idHistoria;
    private LocalDate fechaCreacion;
    private Mascota mascota;
    private Cliente cliente;
    private Empleado veterinario;
    private List<Consulta> consultas = new ArrayList<>();

    public HistoriaClinica(String idHistoria, Mascota mascota,
                           Cliente cliente, Empleado veterinario) {
        this.idHistoria = idHistoria;
        this.fechaCreacion = LocalDate.now();
        this.mascota = mascota;
        this.cliente = cliente;
        this.veterinario = veterinario;
    }

    public void agregarConsulta(Consulta consulta) {
        if (consulta != null) {
            consultas.add(consulta);
            System.out.println("Consulta agregada a la historia clínica.");
        }
    }

    public void eliminarConsulta(int indice) {
        if (indice >= 0 && indice < consultas.size()) {
            consultas.remove(indice);
            System.out.println("Consulta eliminada.");
        } else {
            System.out.println("Índice no válido.");
        }
    }

    public void mostrarHistoria() {
        System.out.println("=".repeat(50));
        System.out.println("       HISTORIA CLÍNICA VETERINARIA");
        System.out.println("=".repeat(50));
        System.out.println("ID Historia : " + idHistoria);
        System.out.println("Fecha       : " + fechaCreacion);
        System.out.println("\n--- PACIENTE ---");
        mascota.mostrarInfo();
        System.out.println("\n--- DUEÑO ---");
        cliente.mostrarDatosCliente();
        System.out.println("\n--- VETERINARIO ---");
        veterinario.mostrarDatosEmpleado();
        System.out.println("\n--- CONSULTAS (" + consultas.size() + ") ---");
        if (consultas.isEmpty()) {
            System.out.println("No hay consultas registradas.");
        } else {
            for (Consulta c : consultas) {
                c.mostrarInfo();
            }
        }
        System.out.println("=".repeat(50));
    }

    public String getIdHistoria() { return idHistoria; }
    public Mascota getMascota() { return mascota; }
    public Cliente getCliente() { return cliente; }
    public Empleado getVeterinario() { return veterinario; }
    public void setVeterinario(Empleado veterinario) { this.veterinario = veterinario; }
    public List<Consulta> getConsultas() { return new ArrayList<>(consultas); }
}