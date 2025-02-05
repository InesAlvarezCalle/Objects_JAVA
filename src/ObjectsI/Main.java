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
                Persona per1 = new Persona();
                Persona per2 = new Persona();

                per1.dni = Leer.leerTexto("Introduce el DNI de la persona 1: ");
                per1.nombre = Leer.leerTexto("Introduce el nombre de la persona 1: ");
                per1.apellidos = Leer.leerTexto("Introduce los apellidos de la persona 1: ");
                per1.edad = Leer.leerEntero("Introduce la edad de la persona 1: ");

                System.out.println();

                per2.dni = Leer.leerTexto("Introduce el DNI de la persona 2: ");
                per2.nombre = Leer.leerTexto("Introduce el nombre de la persona 2: ");
                per2.apellidos = Leer.leerTexto("Introduce los apellidos de la persona 2: ");
                per2.edad = Leer.leerEntero("Introduce la edad de la persona 2: ");

                if(per1.edad >= 18){
                    System.out.println(per1.nombre + " " + per1.apellidos + " con DNI: " + per1.dni + " es mayor de edad.");
                } else {
                    System.out.println(per1.nombre + " " + per1.apellidos + " con DNI: " + per1.dni + " no es mayor de edad.");
                }

                if(per2.edad >= 18){
                    System.out.println(per2.nombre + " " + per2.apellidos + " con DNI: " + per2.dni + " es mayor de edad.");
                } else {
                    System.out.println(per2.nombre + " " + per2.apellidos + " con DNI: " + per2.dni + " no es mayor de edad.");
                }

            } else if (opcion == 3) {
                break;
            } else if (opcion != -1){
                System.out.println("ERROR: El valor introducido es incorrecto");
            }

        } while (opcion != -1);
        System.out.println("¡Hasta la próxima!");
    }
}
