import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("╔══════════════════════════════════╗");
        System.out.println("║    Clínica Veterinaria Pezuña    ║");
        System.out.println("╚══════════════════════════════════╝");


        Mascota m = new Mascota("Evangeline", 11, "perro", "Malamute de Alaska", 27.23f);

        Consulta consulta1 = new Consulta("23/04/2026", "19:00",  "Le duele la oreja", "Otitis", "Gritin cada 8 horas", m);
        Cliente cliente1 = new Cliente("Luisa" ,"123456", "p sherman calle wallaby 47 sidney", "natural", "10001345", LocalDate.of(2026, 5, 7), 7);
        Empleado empleado1 = new Empleado("Kevin", "0987654321", "Calle 6", "Natural", 10.599f, LocalDate.of(2020, 4, 7), "Veterinario");
        cliente1.agregarMascota(m);
        int opcion = 0;
         


        Scanner infoIngresada =  new Scanner(System.in);
        do{
            Menu();
            int opcionCliente = 0;
            opcion = infoIngresada.nextInt();
            infoIngresada.nextLine();

            switch(opcion){
                case 1:
                    

                    switch (opcionCliente){

                    }
                    System.out.println("o=o=o=> CLIENTE <=o=o=o");
                    cliente1.mostrarDatosCliente();
                break;
                case 2:
                    System.out.println("o=o=o=> MASCOTA <=o=o=o");
                    m.mostrarInfo();
                break;
                case 3:
                    System.out.println("o=o=o=> CONSULTA <=o=o=o");
                    consulta1.mostrarInfo();
                break;
                    case 4:
                    System.out.println("o=o=o=> EMPLEADO <=o=o=o");
                    empleado1.mostrarInfo();
                break;
                case 5:
                infoIngresada.close();
                break;
            }
        }
        while(opcion !=5);
    }

    public static void Menu(){
        System.out.println("MENU VETERINARIA LA PEZUÑA");
        System.out.println("Opción 1 : Cliente");
        System.out.println("Opción 2 : Mascota");
        System.out.println("Opción 3 : Consulta");
        System.out.println("Opción 4 :Empleado");
        System.out.println("Opción 5 Salir");
        System.out.println("Ingrese una opción: ");
    }
}





