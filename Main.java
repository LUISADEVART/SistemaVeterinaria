import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Mascota m1 = new Mascota("Evangeline", 11, "perro", "Malamute de Alaska", 27.23f);

        Consulta c1 = new Consulta("23/04/2026", "19:00",  "Le duele la oreja", "Otitis", "Gritin cada 8 horas", m1);

    int opcion;
    Scanner infoIngresada =  new Scanner(System.in);
        do{
            Menu();

            opcion = infoIngresada.nextInt();
            infoIngresada.nextLine();

            switch(opcion){
                case 1:
                    System.out.println("o=o=o=> Persona <=o=o=o");

                break;
                case 2:
                    m1.MostrarInfo();
                break;
                case 3:
                    System.out.println("o=o=o=> Consulta <=o=o=o");
                    c1.MostrarInfo();
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
        System.out.println("Opción 1 : Persona");
        System.out.println("Opción 2 : Mascota");
        System.out.println("Opción 3 : Consulta");
        System.out.println("Opción 4 Salir del programa Vet");
        System.out.println("Luisa la mansa paloma");
    }
}

     



