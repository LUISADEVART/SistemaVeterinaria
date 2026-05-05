public class Mascota {
    private String nombre;
    private int edad;
    private String especie;
    private String raza;
    private Float peso;

    public Mascota(String nombre, int edad, String especie, String raza, Float peso){
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
        this.raza = raza;
        this.peso = peso;
    }

    public void MostrarInfo(){
        System.out.println("El nombre de la mascota es: " + nombre);
        System.out.println("La edad de la mascota es: " + edad);
        System.out.println("La especie de la mascota es: " + especie);
        System.out.println("La raza de la mascota es: " + raza);
        System.out.println("El peso de la mascota es: " + peso);
    }
}
