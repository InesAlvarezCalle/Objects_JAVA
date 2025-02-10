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
                Punto p1 = new Punto(5, 0);
                Punto p2 = new Punto(10, 10);
                Punto p3 = new Punto(-3, 7);

                System.out.println("Las coordenadas del punto 1 son: ");
                p1.mostrar();
                System.out.println("Las coordenadas del punto 1 son: ");
                p2.mostrar();
                System.out.println("Las coordenadas del punto 1 son: ");
                p3.mostrar();

                p1.desplaza(6, true);
                p1.desplaza(4, false);

                p2.desplaza(9, true);
                p2.desplaza(2, false);

                p3.desplaza(1, true);
                p3.desplaza(5, false);

                System.out.println("-----------------------------------------------");
                System.out.println("COORDENADAS ACTUALES:");
                System.out.println("-----------------------------------------------");
                System.out.println("Las coordenadas del punto 1 son: ");
                p1.mostrar();
                System.out.println("Las coordenadas del punto 2 son: ");
                p2.mostrar();
                System.out.println("Las coordenadas del punto 3 son: ");
                p3.mostrar();

            } else if (opcion == 2) {
                Persona per1 = new Persona("53882133X", "Inés", "Álvarez Calle", 20);
                Persona per2 = new Persona("Sergi", 18);

                per1.mostrar();
                per2.mostrar();

                System.out.println("Persona 1 es mayor de edad: " + per1.esMayorEdad());
                System.out.println("Persona 2 es mayor de edad: " + per2.esMayorEdad());

                System.out.println("Persona 1 es mayor de edad: " + per1.esJubilado());
                System.out.println("Persona 2 es mayor de edad: " + per2.esJubilado());

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
