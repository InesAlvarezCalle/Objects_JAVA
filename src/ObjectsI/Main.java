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
                Rectangulo rec1 = new Rectangulo();
                Rectangulo rec2 = new Rectangulo();
                int perimetro1, perimetro2, area1, area2, ancho1, ancho2, altura1, altura2;

                rec1.x1 = 0;
                rec1.y1 = 0;
                rec1.x2 = 5;
                rec1.y2 = 5;

                rec2.x1 = 7;
                rec2.y1 = 9;
                rec2.x2 = -3;
                rec2.y2 = 7;

                perimetro1 = rec1.x1 + rec1.y1 + rec1.x2 + rec1.y2;
                perimetro2 = rec2.x1 + rec2.y1 + rec2.x2 + rec2.y2;

                ancho1 = Math.abs(rec1.x1 - rec1.x2);
                ancho2 = Math.abs(rec2.x1 - rec2.x2);

                altura1 = Math.abs(rec1.y1 -rec1.y2);
                altura2 = Math.abs(rec2.y1 -rec2.y2);

                area1 = ancho1 * altura1;
                area2 = ancho2 * altura2;


                System.out.println("Rectangulo 1 Coordenadas (" + rec1.x1 + "," + rec1.x2 + ") " + "(" + rec1.y1 + "," + rec1.y2 + "). Perímetro: " + perimetro1 + ". Area: " + area1);
                System.out.println("Rectangulo 2 Coordenadas (" + rec2.x1 + "," + rec2.x2 + ") " + "(" + rec2.y1 + "," + rec2.y2 + "). Perímetro: " + perimetro2 + ". Area: " + area2);

                rec1.x1 += 3;
                rec1.y1 -= 6;
                rec1.x2 *= 2;
                rec1.y2 += 9;

                rec2.x1 -= 5;
                rec2.y1 *= 4;
                rec2.x2 += 1;
                rec2.y2 -= 8;

                perimetro1 = rec1.x1 + rec1.y1 + rec1.x2 + rec1.y2;
                perimetro2 = rec2.x1 + rec2.y1 + rec2.x2 + rec2.y2;

                ancho1 = Math.abs(rec1.x1 - rec1.x2);
                ancho2 = Math.abs(rec2.x1 - rec2.x2);

                altura1 = Math.abs(rec1.y1 -rec1.y2);
                altura2 = Math.abs(rec2.y1 -rec2.y2);

                area1 = ancho1 * altura1;
                area2 = ancho2 * altura2;

                System.out.println("-----------------------------------------------");
                System.out.println("DATOS ACTUALIZADOS:");
                System.out.println("-----------------------------------------------");
                System.out.println("Rectangulo 1 Coordenadas (" + rec1.x1 + "," + rec1.x2 + ") " + "(" + rec1.y1 + "," + rec1.y2 + "). Perímetro: " + perimetro1 + ". Area: " + area1);
                System.out.println("Rectangulo 2 Coordenadas (" + rec2.x1 + "," + rec2.x2 + ") " + "(" + rec2.y1 + "," + rec2.y2 + "). Perímetro: " + perimetro2 + ". Area: " + area2);

            } else if (opcion != -1){
                System.out.println("ERROR: El valor introducido es incorrecto");
            }

        } while (opcion != -1);
        System.out.println("¡Hasta la próxima!");
    }
}
