import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("╔══════════════════════════════════╗");
        System.out.println("║    Clínica Veterinaria la Pezuña ║");
        System.out.println("╚══════════════════════════════════╝");

        Mascota m = new Mascota("Evangeline", 11, "perro", "Malamute de Alaska", 27.23f);

        Consulta consulta1 = new Consulta(
                "23/04/2026", "19:00",
                "Le duele la oreja", "Otitis", "Gritin cada 8 horas", m);

        Cliente cliente1 = new Cliente(
                "Luisa", "123456", "p sherman calle wallaby 47 sidney",
                "natural", "10001345", LocalDate.of(2026, 5, 7), 7);

        Empleado empleado1 = new Empleado(
                "Kevin", "0987654321", "Calle 6", "Natural",
                10.599f, LocalDate.of(2020, 4, 7), "Veterinario");

        cliente1.agregarMascota(m);

        Scanner infoIngresada = new Scanner(System.in);
        int opcion = 0;

        do {
            menuPrincipal();
            opcion = infoIngresada.nextInt();
            infoIngresada.nextLine();

            switch (opcion) {
                case 1:
                    menuCliente(cliente1, infoIngresada);
                    break;
                case 2:
                    System.out.println("o=o=o=> MASCOTA <=o=o=o");
                    m.mostrarInfo();
                    break;
                case 3:
                    menuConsulta(consulta1);
                    break;
                case 4:
                    menuEmpleado(empleado1, infoIngresada);
                    break;
                case 5:
                    System.out.println("Hasta luego.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);

        infoIngresada.close();
    }

    public static void menuPrincipal() {
        System.out.println("\nMENU VETERINARIA LA PEZUÑA");
        System.out.println("Opción 1 : Cliente");
        System.out.println("Opción 2 : Mascota");
        System.out.println("Opción 3 : Consulta");
        System.out.println("Opción 4 : Empleado");
        System.out.println("Opción 5 : Salir");
        System.out.print("Ingrese una opción: ");
    }

    public static void menuCliente(Cliente cliente1, Scanner infoIngresada) {
        int opcionCliente;
        do {
            System.out.println("\n>MENU CLIENTE<");
            System.out.println("1. Registrar cliente");
            System.out.println("2. Mostrar datos del cliente");
            System.out.println("3. Actualizar datos del cliente");
            System.out.println("4. Agregar mascota");
            System.out.println("5. Mostrar mascotas");
            System.out.println("6. Eliminar mascota");
            System.out.println("7. Volver al menú principal");
            System.out.print("Opción: ");

            opcionCliente = infoIngresada.nextInt();
            infoIngresada.nextLine();

            switch (opcionCliente) {
                case 1:
                    cliente1.registrarCliente();
                    break;
                case 2:
                    cliente1.mostrarDatosCliente();
                    break;
                case 3:
                    System.out.print("Campo (nombre, telefono, direccion): ");
                    String campo = infoIngresada.nextLine();
                    System.out.print("Nuevo valor: ");
                    String valor = infoIngresada.nextLine();
                    cliente1.actualizarDatosCliente(campo, valor);
                    break;
                case 4:
                    System.out.print("Nombre mascota: ");
                    String nombre = infoIngresada.nextLine();
                    System.out.print("Edad: ");
                    int edad = Integer.parseInt(infoIngresada.nextLine().trim());
                    System.out.print("Especie: ");
                    String especie = infoIngresada.nextLine();
                    System.out.print("Raza: ");
                    String raza = infoIngresada.nextLine();
                    System.out.print("Peso: ");
                    float peso = Float.parseFloat(infoIngresada.nextLine().trim().replace(',', '.'));
                    cliente1.agregarMascota(new Mascota(nombre, edad, especie, raza, peso));
                    break;
                case 5:
                    cliente1.mostrarMascota();
                    break;
                case 6:
                    System.out.print("Nombre de la mascota a eliminar: ");
                    cliente1.eliminarMascota(infoIngresada.nextLine());
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcionCliente != 7);
    }

    public static void menuEmpleado(Empleado empleado1, Scanner infoIngresada) {
        int opcionEmpleado;
        do {
            System.out.println("\n>MENU EMPLEADO<");
            System.out.println("1. Registrar empleado");
            System.out.println("2. Mostrar datos del empleado");
            System.out.println("3. Actualizar datos del empleado");
            System.out.println("4. Volver al menú principal");
            System.out.print("Opción: ");

            opcionEmpleado = infoIngresada.nextInt();
            infoIngresada.nextLine();

            switch (opcionEmpleado) {
                case 1:
                    empleado1.registrarEmpleado();
                    break;
                case 2:
                    empleado1.mostrarDatosEmpleado();
                    break;
                case 3:
                    System.out.print("Campo (nombre, telefono, direccion, cargo, salario): ");
                    String campo = infoIngresada.nextLine();
                    System.out.print("Nuevo valor: ");
                    String valor = infoIngresada.nextLine();
                    empleado1.actualizarDatosEmpleado(campo, valor);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcionEmpleado != 4);
    }

    public static void menuConsulta(Consulta consulta1) {
        System.out.println("\n>MENU CONSULTA<");
        consulta1.mostrarInfo();
    }
}
