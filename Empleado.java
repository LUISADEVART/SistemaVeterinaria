import java.time.LocalDate;

public class Empleado extends Persona{

    private Float salario;
    private LocalDate fechaContratacion;
    private String cargo;

    public Empleado(String nombre, String telefono, String direccion, String tipoPersona, Float salario,LocalDate fechaContratacion, String cargo){

        super(nombre,telefono,direccion,tipoPersona);
        this.salario = salario;
        this.fechaContratacion = fechaContratacion;
        this.cargo = cargo;
    }
    @Override
    public void mostrarInfo(){
        System.out.println("Cargo: " + cargo);
        System.out.println("Nombre: " + getNombre());
        System.out.println("Telefono: " + getTelefono());
        System.out.println("Dirección: " + getDireccion());
        System.out.println("Tipo Persona" + getTipoPersona());
        System.out.println("Salario: " + salario);
        System.out.println("Fecha de Contratación: " + fechaContratacion);
    }
    //getters
    public  String getCargo(){
        return cargo;
    }
    public LocalDate getFechaContratacion()
    {
        return fechaContratacion;
    }
    public Float salario(){
        return salario;
    }
    //setters
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    public void SerFechaContratacion(LocalDate fechaContratacion){
        this.fechaContratacion = fechaContratacion;
    }
    public void salario(Float salario){
        this.salario = salario;
    }

}