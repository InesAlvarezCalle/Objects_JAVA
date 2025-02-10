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
                Rectangulo rec1 = new Rectangulo(0, 0, 5, 5);
                Rectangulo rec2 = new Rectangulo(7, 9, -3, 7);

                rec1.mostrar();
                rec2.mostrar();

                System.out.println("PERÍMETRO DEL RECTÁNGULO 1: " + rec1.perimetro());
                System.out.println("ÁREA DEL RECTÁNGULO 1: " + rec1.area());

                System.out.println("PERÍMETRO DEL RECTÁNGULO 2: " + rec2.perimetro());
                System.out.println("ÁREA DEL RECTÁNGULO 2: " + rec2.area());

            } else if (opcion != -1){
                System.out.println("ERROR: El valor introducido es incorrecto");
            }

        } while (opcion != -1);
        System.out.println("¡Hasta la próxima!");
    }
}
