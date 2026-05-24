import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("╔══════════════════════════════════╗");
        System.out.println("║    Clínica Veterinaria la Pezuña ║");
        System.out.println("╚══════════════════════════════════╝");

        Mascota m = new Mascota("Evangeline", 11, "perro", "Malamute de Alaska", 27.23f);

        Consulta consulta1 = new Consulta(
                LocalDate.of(2026, 4, 3), LocalTime.of(19, 0),
                "Le duele la oreja", "Otitis", "Gritin cada 8 horas", m);

        Cliente cliente1 = new Cliente(
                "Luisa", "123456", "p sherman calle wallaby 47 sidney",
                "natural", "10001345", LocalDate.of(2026, 5, 7), 7);
        cliente1.agregarMascota(m);

        Empleado empleado1 = new Empleado(
                "Kevin", "0987654321", "Calle 6", "Natural",
                10.599f, LocalDate.of(2020, 4, 7), "Veterinario");

        HistoriaClinica historia = new HistoriaClinica("H001", m, cliente1, empleado1);
        historia.agregarConsulta(consulta1);

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
                    menuConsulta(consulta1, infoIngresada); // ✅ se pasa infoIngresada
                    break;
                case 4:
                    menuEmpleado(empleado1, infoIngresada);
                    break;
                case 5:
                    menuHistoriaClinica(historia, infoIngresada, m);
                    break;
                case 6:
                    System.out.println("Hasta luego.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 6);

        infoIngresada.close();
    }

    public static void menuPrincipal() {
        System.out.println("\nMENU VETERINARIA LA PEZUÑA");
        System.out.println("Opción 1 : Cliente");
        System.out.println("Opción 2 : Mascota");
        System.out.println("Opción 3 : Consulta");
        System.out.println("Opción 4 : Empleado");
        System.out.println("Opción 5 : Historia Clínica");
        System.out.println("Opción 6 : Salir");
        System.out.print("Ingrese una opción: ");
    }

    // ✅ menuConsulta corregido
    public static void menuConsulta(Consulta consulta1, Scanner infoIngresada) {
        int opcionConsulta;
        do {
            System.out.println("\n>MENU CONSULTA<");
            System.out.println("1. Agendar consulta");
            System.out.println("2. Mostrar información de la consulta");
            System.out.println("3. Cancelar consulta");
            System.out.println("4. Tratamiento asignado");
            System.out.println("5. Generar factura");
            System.out.println("6. Crear historia clínica");
            System.out.println("7. Volver al menú principal");
            System.out.print("Opción: ");

            opcionConsulta = infoIngresada.nextInt();
            infoIngresada.nextLine();

            switch (opcionConsulta) {
                case 1:
                    consulta1.agendarConsulta();
                    break;
                case 2:
                    consulta1.mostrarInfo();
                    break;
                case 3:
                    consulta1.cancelarConsulta();
                    break;
                case 4:
                    consulta1.asignarTratamiento();
                    break;
                case 5:
                    consulta1.generarFactura();
                    break;
                case 6:
                    consulta1.crearHistoriaClinica();
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcionConsulta != 7);
    }

    public static void menuHistoriaClinica(HistoriaClinica historia,
                                            Scanner infoIngresada, Mascota m) {
        int opcion;
        do {
            System.out.println("\n>MENU HISTORIA CLÍNICA<");
            System.out.println("1. Mostrar historia clínica");
            System.out.println("2. Agregar consulta");
            System.out.println("3. Eliminar consulta");
            System.out.println("4. Volver al menú principal");
            System.out.print("Opción: ");

            opcion = infoIngresada.nextInt();
            infoIngresada.nextLine();

            switch (opcion) {
                case 1:
                    historia.mostrarHistoria();
                    break;
                case 2:
                    int anio = leerEntero(infoIngresada, "Año: ");
                    int mes = leerEntero(infoIngresada, "Mes (1-12): ");
                    int dia = leerEntero(infoIngresada, "Día: ");
                    int hora = leerEntero(infoIngresada, "Hora (0-23): ");
                    int minutos = leerEntero(infoIngresada, "Minutos: ");
                    System.out.print("Motivo: ");
                    String motivo = infoIngresada.nextLine();
                    System.out.print("Diagnóstico: ");
                    String diagnostico = infoIngresada.nextLine();
                    System.out.print("Tratamiento: ");
                    String tratamiento = infoIngresada.nextLine();
                    historia.agregarConsulta(new Consulta(
                            LocalDate.of(anio, mes, dia),
                            LocalTime.of(hora, minutos),
                            motivo, diagnostico, tratamiento, m));
                    break;
                case 3:
                    int indice = leerEntero(infoIngresada, "Índice de consulta a eliminar (empieza en 0): ");
                    historia.eliminarConsulta(indice);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 4);
    }

    private static int leerEntero(Scanner scanner, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String linea = scanner.nextLine().trim();
            if (linea.isEmpty()) {
                System.out.println("Debe ingresar un número.");
                continue;
            }
            try {
                return Integer.parseInt(linea);
            } catch (NumberFormatException e) {
                System.out.println("Número no válido. Intente de nuevo.");
            }
        }
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
                    cliente1.registrarCliente(infoIngresada);
                    break;
                case 2:
                    cliente1.mostrarDatosCliente();
                    break;
                case 3:
                    System.out.print("Escribe el campo que quieres editar (nombre, telefono, direccion): ");
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
                    empleado1.registrarEmpleado(infoIngresada);
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
}
