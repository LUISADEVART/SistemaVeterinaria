import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Consulta implements IConsulta {

    private LocalDate fecha;
    private LocalTime hora;
    private String motivoConsulta;
    private String diagnostico;
    private String tratamiento;
    private Mascota mascota;
    private boolean agendada;
    private boolean cancelada;

    public Consulta(LocalDate fecha,
                    LocalTime hora,
                    String motivoConsulta,
                    String diagnostico,
                    String tratamiento,
                    Mascota mascota) {
        this.fecha = fecha;
        this.hora = hora;
        this.motivoConsulta = motivoConsulta;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
        this.mascota = mascota;
        this.agendada = false;
        this.cancelada = false;
    }

    @Override
    public void agendarConsulta() {
        if (cancelada) {
            System.out.println("No se puede agendar, la consulta fue cancelada.");
            return;
        }
        this.agendada = true;
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatoHora  = DateTimeFormatter.ofPattern("hh:mm a");
        System.out.println("Consulta agendada correctamente.");
        System.out.println("Paciente : " + mascota.getNombre());
        System.out.println("Fecha    : " + fecha.format(formatoFecha));
        System.out.println("Hora     : " + hora.format(formatoHora));
    }

    @Override
    public void cancelarConsulta() {
        if (!agendada) {
            System.out.println("No hay consulta agendada para cancelar.");
            return;
        }
        this.agendada = false;
        this.cancelada = true;
        System.out.println("La consulta de " + mascota.getNombre() + " ha sido cancelada.");
    }

    @Override
    public void asignarTratamiento() {
        if (diagnostico == null || diagnostico.isEmpty()) {
            System.out.println("No se puede asignar tratamiento sin un diagnóstico.");
            return;
        }
        System.out.println("=== TRATAMIENTO ASIGNADO ===");
        System.out.println("Paciente    : " + mascota.getNombre());
        System.out.println("Diagnóstico : " + diagnostico);
        System.out.println("Tratamiento : " + tratamiento);
    }

    @Override
    public void crearHistoriaClinica() {
        System.out.println("=== HISTORIA CLÍNICA ===");
        System.out.println("Paciente    : " + mascota.getNombre());
        System.out.println("Motivo      : " + motivoConsulta);
        System.out.println("Diagnóstico : " + diagnostico);
        System.out.println("Tratamiento : " + tratamiento);
    }

    @Override
    public void generarFactura() {
        System.out.println("========== FACTURA ==========");
        System.out.println("Clínica Veterinaria La Pezuña");
        System.out.println("-----------------------------");
        System.out.println("Paciente    : " + mascota.getNombre());
        System.out.println("Motivo      : " + motivoConsulta);
        System.out.println("Diagnóstico : " + diagnostico);
        System.out.println("Tratamiento : " + tratamiento);
        System.out.println("Estado      : " + (cancelada ? "CANCELADA" : "ACTIVA"));
        System.out.println("=============================");
    }

    
    public void mostrarInfo() {
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatoHora  = DateTimeFormatter.ofPattern("hh:mm a");
        System.out.println("===== CONSULTA =====");
        System.out.println("Fecha       : " + fecha.format(formatoFecha));
        System.out.println("Hora        : " + hora.format(formatoHora));
        System.out.println("Motivo      : " + motivoConsulta);
        System.out.println("Diagnóstico : " + diagnostico);
        System.out.println("Tratamiento : " + tratamiento);
        System.out.println("Agendada    : " + (agendada ? "Sí" : "No"));
        System.out.println("Cancelada   : " + (cancelada ? "Sí" : "No"));
        System.out.println("-- Mascota --");
        mascota.mostrarInfo();
    }

    public LocalDate getFecha() { return fecha; }
    public LocalTime getHora() { return hora; }
    public String getMotivoConsulta() { return motivoConsulta; }
    public String getDiagnostico() { return diagnostico; }
    public String getTratamiento() { return tratamiento; }
    public Mascota getMascota() { return mascota; }
    public boolean isAgendada() { return agendada; }
    public boolean isCancelada() { return cancelada; }
}