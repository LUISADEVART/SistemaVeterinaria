import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Consulta {
    private LocalDate fecha;
    private LocalTime hora;
    private String motivoConsulta;
    private String diagnostico;
    private String tratamiento;
    private Mascota mascota;


    public Consulta(String fecha, String hora, String motivoConsulta, String diagnostico, String tratamiento, Mascota mascota) {
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");

        this.fecha = LocalDate.parse(fecha, formatoFecha);
        this.hora = LocalTime.parse(hora, formatoHora);
        this.motivoConsulta = motivoConsulta;
        this.diagnostico = diagnostico;
        this.mascota = mascota;
    }

    public void mostrarInfo() {
 
        System.out.println("=".repeat(50));        
        System.out.print("Informacion de la mascota: ");
        mascota.mostrarInfo();
        System.out.println("=".repeat(50));
        DateTimeFormatter formatoFechaSalida = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatoHoraSalida = DateTimeFormatter.ofPattern("hh:mm a");
        System.out.println("La fecha de la consulta es: " + fecha.format(formatoFechaSalida));
        System.out.println("La hora de la consulta: " + hora.format(formatoHoraSalida));
        System.out.println("El motivo de la consulta es: " + motivoConsulta);
        System.out.println("El diagnóstico de la consulta es: " + diagnostico);
        System.out.println("El tratamiento de la consulta es: " + tratamiento);
        
    }
}
