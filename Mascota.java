public class Mascota {
    private String nombre;
    private int edad;
    private String especie;
    private String raza;
    private Float peso;

    public Mascota(String nombre, int edad, String especie, String raza, Float peso){
        this.nombre  = nombre;
        this.edad    = edad;
        this.especie = especie;
        this.raza = raza;
        this.peso = peso;
    }

    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Especie: " + especie);
        System.out.println("Raza: " + raza);
        System.out.println("Peso en KG: " + peso);
    }
    public String getNombre()  { return nombre; }
    public int    getEdad()    { return edad; }
    public String getEspecie() { return especie; }
    public String getRaza()    { return raza; }
    public Float  getPeso()    { return peso; }
}
