import java.time.LocalDate;

public class Empleado extends Persona implements IEmpleado {

    private Float salario;
    private LocalDate fechaContratacion;
    private String cargo;

    public Empleado(String nombre, String telefono, String direccion, String tipoPersona,
                    Float salario, LocalDate fechaContratacion, String cargo) {
        super(nombre, telefono, direccion, tipoPersona);
        this.salario = salario;
        this.fechaContratacion = fechaContratacion;
        this.cargo = cargo;
    }

    @Override
    public void registrarEmpleado() {
        System.out.println("Empleado registrado: " + getNombre());
    }

    @Override
    public void mostrarDatosEmpleado() {
        mostrarInfo();
    }

    @Override
    public void actualizarDatosEmpleado(String campo, Object nuevoValor) {
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
            case "cargo":
                this.cargo = (String) nuevoValor;
                break;
            case "salario":
                this.salario = Float.parseFloat(nuevoValor.toString());
                break;
            default:
                System.out.println("Campo no reconocido: " + campo);
        }
    }

    public void mostrarInfo() {
        System.out.println("Cargo: " + cargo);
        System.out.println("Nombre: " + getNombre());
        System.out.println("Telefono: " + getTelefono());
        System.out.println("Dirección: " + getDireccion());
        System.out.println("Tipo Persona: " + getTipoPersona());
        System.out.println("Salario: " + salario);
        System.out.println("Fecha de Contratación: " + fechaContratacion);
    }

    public String getCargo() {
        return cargo;
    }

    public LocalDate getFechaContratacion() {
        return fechaContratacion;
    }

    public Float getSalario() {
        return salario;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setFechaContratacion(LocalDate fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }
}
