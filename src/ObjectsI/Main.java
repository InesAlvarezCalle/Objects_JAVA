package ObjectsI;

public class Main {
    public static void main(String[] args){
        int opcion;

        do {
            System.out.println("1. Clase Punto");
            System.out.println("2. Clase Persona");
            System.out.println("3. Clase Rectangulo");
            System.out.println("-1. SALIR");

            opcion = Leer.leerEntero("Introduzca la opción que desea utilizar: ");

            if (opcion == 1){
                Punto p1 = new Punto();
                Punto p2 = new Punto();
                Punto p3 = new Punto();

                p1.x = 5;
                p1.y = 0;

                p2.x = 10;
                p2.y = 10;

                p3.x = -3;
                p3.y = 7;

                System.out.println("Las coordenadas del punto 1 son: " + p1.x + " " + p1.y + ".");
                System.out.println("Las coordenadas del punto 1 son: " + p2.x + " " + p2.y + ".");
                System.out.println("Las coordenadas del punto 1 son: " + p3.x + " " + p3.y + ".");

                p1.x += 3;
                p1.y -= 9;

                p2.x *= 5;
                p2.y += 2;

                p3.x *= 5;
                p3.y -= 2;

                System.out.println("-----------------------------------------------");
                System.out.println("COORDENADAS ACTUALES:");
                System.out.println("-----------------------------------------------");
                System.out.println("Las coordenadas del punto 1 son: " + p1.x + " " + p1.y + ".");
                System.out.println("Las coordenadas del punto 1 son: " + p2.x + " " + p2.y + ".");
                System.out.println("Las coordenadas del punto 1 son: " + p3.x + " " + p3.y + ".");

            } else if (opcion == 2) {
                break;
            } else if (opcion == 3) {
                break;
            } else if (opcion != -1){
                System.out.println("ERROR: El valor introducido es incorrecto");
            }

        } while (opcion != -1);
        System.out.println("¡Hasta la próxima!");
    }
}
