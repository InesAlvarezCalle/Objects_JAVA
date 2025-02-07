package ObjectsII;

public class Main {
    public static void main (String[] args){
        int opcion;

        do{
            System.out.println("-----------------------------------------");
            System.out.println("Menú");
            System.out.println("-----------------------------------------");
            System.out.println("1. Concursantes");
            System.out.println("2. Alumnos");
            System.out.println("0. SALIR");
            System.out.println("-----------------------------------------");

            opcion = Leer.leerEntero("Introduce la opción que desea utilizar: ");

            if (opcion == 1){
                Concursante c1 = new Concursante();
                Concursante c2 = new Concursante();
                Concursante c3 = new Concursante();

                System.out.println("-----------------------------------------");
                System.out.println("DATOS CONCURSANTE 1:");
                System.out.println("-----------------------------------------");
                c1.nombreCompleto.nombre = Leer.leerTexto("Nombre: ");
                c1.nombreCompleto.primerApellido = Leer.leerTexto("Primer apellido: ");
                c1.nombreCompleto.segundoApellido = Leer.leerTexto("Segundo apellido: ");
                c1.nombreArtistico = Leer.leerTexto("Apodo: ");
                c1.domicilio.calle = Leer.leerTexto("Calle: ");
                c1.domicilio.numPiso = Leer.leerEntero("Nº piso: ");
                c1.domicilio.puerta = Leer.leerEntero("Puerta: ");
                c1.domicilio.numPostal = Leer.leerEntero("CP: ");
                c1.domicilio.poblacion = Leer.leerTexto("Poblacion: ");
                c1.domicilio.provincia = Leer.leerTexto("Provincia: ");
                c1.anioNacimiento = Leer.leerEntero("Año nacimiento: ");
                c1.concurso.titulo = Leer.leerTexto("Título concurso: ");
                c1.concurso.fecha.anio = Leer.leerEntero("Año del concurso: ");
                c1.concurso.fecha.mes = Leer.leerEntero("Mes del concurso: ");
                c1.concurso.fecha.dia = Leer.leerEntero("Día del concurso: ");
                c1.concurso.tiempo.horas = Leer.leerEntero("Tiempo horas concurso: ");
                c1.concurso.tiempo.minutos = Leer.leerEntero("Tiempo minutos concurso: ");
                c1.concurso.tiempo.segundos = Leer.leerEntero("Tiempo segundos concurso: ");
                c1.concurso.tiempo.centesimas = Leer.leerEntero("Tiempo centésimas concurso: ");

                System.out.println("-----------------------------------------");
                System.out.println("DATOS CONCURSANTE 2:");
                System.out.println("-----------------------------------------");
                c2.nombreCompleto.nombre = Leer.leerTexto("Nombre: ");
                c2.nombreCompleto.primerApellido = Leer.leerTexto("Primer apellido: ");
                c2.nombreCompleto.segundoApellido = Leer.leerTexto("Segundo apellido: ");
                c2.nombreArtistico = Leer.leerTexto("Apodo: ");
                c2.domicilio.calle = Leer.leerTexto("Calle: ");
                c2.domicilio.numPiso = Leer.leerEntero("Nº piso: ");
                c2.domicilio.puerta = Leer.leerEntero("Puerta: ");
                c2.domicilio.numPostal = Leer.leerEntero("CP: ");
                c2.domicilio.poblacion = Leer.leerTexto("Poblacion: ");
                c2.domicilio.provincia = Leer.leerTexto("Provincia: ");
                c2.anioNacimiento = Leer.leerEntero("Año nacimiento: ");
                c2.concurso.titulo = Leer.leerTexto("Título concurso: ");
                c2.concurso.fecha.anio = Leer.leerEntero("Año del concurso: ");
                c2.concurso.fecha.mes = Leer.leerEntero("Mes del concurso: ");
                c2.concurso.fecha.dia = Leer.leerEntero("Día del concurso: ");
                c2.concurso.tiempo.horas = Leer.leerEntero("Tiempo horas concurso: ");
                c2.concurso.tiempo.minutos = Leer.leerEntero("Tiempo minutos concurso: ");
                c2.concurso.tiempo.segundos = Leer.leerEntero("Tiempo segundos concurso: ");
                c2.concurso.tiempo.centesimas = Leer.leerEntero("Tiempo centésimas concurso: ");

                System.out.println("-----------------------------------------");
                System.out.println("DATOS CONCURSANTE 3:");
                System.out.println("-----------------------------------------");
                c3.nombreCompleto.nombre = Leer.leerTexto("Nombre: ");
                c3.nombreCompleto.primerApellido = Leer.leerTexto("Primer apellido: ");
                c3.nombreCompleto.segundoApellido = Leer.leerTexto("Segundo apellido: ");
                c3.nombreArtistico = Leer.leerTexto("Apodo: ");
                c3.domicilio.calle = Leer.leerTexto("Calle: ");
                c3.domicilio.numPiso = Leer.leerEntero("Nº piso: ");
                c3.domicilio.puerta = Leer.leerEntero("Puerta: ");
                c3.domicilio.numPostal = Leer.leerEntero("CP: ");
                c3.domicilio.poblacion = Leer.leerTexto("Población: ");
                c3.domicilio.provincia = Leer.leerTexto("Provincia: ");
                c3.anioNacimiento = Leer.leerEntero("Año nacimiento: ");
                c3.concurso.titulo = Leer.leerTexto("Título concurso: ");
                c3.concurso.fecha.anio = Leer.leerEntero("Año del concurso: ");
                c3.concurso.fecha.mes = Leer.leerEntero("Mes del concurso: ");
                c3.concurso.fecha.dia = Leer.leerEntero("Día del concurso: ");
                c3.concurso.tiempo.horas = Leer.leerEntero("Tiempo horas concurso: ");
                c3.concurso.tiempo.minutos = Leer.leerEntero("Tiempo minutos concurso: ");
                c3.concurso.tiempo.segundos = Leer.leerEntero("Tiempo segundos concurso: ");
                c3.concurso.tiempo.centesimas = Leer.leerEntero("Tiempo centésimas concurso: ");

                System.out.println(c1.nombreCompleto.nombre + " " + c1.nombreCompleto.primerApellido + " " + c1.nombreCompleto.segundoApellido +
                        " (" + c1.nombreArtistico + "). Vine en: " + c1.domicilio.calle + ", " + c1.domicilio.numPiso + ", " + c1.domicilio.puerta +
                        ", " + c1.domicilio.numPiso + ", " + c1.domicilio.poblacion + ", " + c1.domicilio.provincia + ", " + c1.domicilio.numPostal +
                        ". Nació el: " + c1.anioNacimiento +". Se ha inscrito al concurso: " + c1.concurso.titulo + " que se realizará el: " +
                        c1.concurso.fecha.dia + "/" + c1.concurso.fecha.mes + "/" + c1.concurso.fecha.anio + ". La duración es de: " +
                        c1.concurso.tiempo.horas + ":" + c1.concurso.tiempo.minutos + ":" +c1.concurso.tiempo.segundos + ":" + c1.concurso.tiempo.centesimas + ".");

                System.out.println(c2.nombreCompleto.nombre + " " + c2.nombreCompleto.primerApellido + " " + c2.nombreCompleto.segundoApellido +
                        " (" + c2.nombreArtistico + "). Vine en: " + c2.domicilio.calle + ", " + c2.domicilio.numPiso + ", " + c2.domicilio.puerta +
                        ", " + c2.domicilio.numPiso + ", " + c2.domicilio.poblacion + ", " + c2.domicilio.provincia + ", " + c2.domicilio.numPostal +
                        ". Nació el: " + c2.anioNacimiento +". Se ha inscrito al concurso: " + c2.concurso.titulo + " que se realizará el: " +
                        c2.concurso.fecha.dia + "/" + c2.concurso.fecha.mes + "/" + c2.concurso.fecha.anio + ". La duración es de: " +
                        c2.concurso.tiempo.horas + ":" + c2.concurso.tiempo.minutos + ":" +c2.concurso.tiempo.segundos + ":" + c2.concurso.tiempo.centesimas + ".");

                System.out.println(c3.nombreCompleto.nombre + " " + c3.nombreCompleto.primerApellido + " " + c3.nombreCompleto.segundoApellido +
                        " (" + c3.nombreArtistico + "). Vine en: " + c3.domicilio.calle + ", " + c3.domicilio.numPiso + ", " + c3.domicilio.puerta +
                        ", " + c3.domicilio.numPiso + ", " + c3.domicilio.poblacion + ", " + c3.domicilio.provincia + ", " + c3.domicilio.numPostal +
                        ". Nació el: " + c3.anioNacimiento +". Se ha inscrito al concurso: " + c3.concurso.titulo + " que se realizará el: " +
                        c3.concurso.fecha.dia + "/" + c3.concurso.fecha.mes + "/" + c3.concurso.fecha.anio + ". La duración es de: " +
                        c3.concurso.tiempo.horas + ":" + c3.concurso.tiempo.minutos + ":" +c3.concurso.tiempo.segundos + ":" + c3.concurso.tiempo.centesimas + ".");
            } else if (opcion == 2) {
                Alumno a1 = new Alumno();
                Alumno a2 = new Alumno();
                Alumno a3 = new Alumno();

                leerAlumno(a1);
                leerAlumno(a2);
                leerAlumno(a3);

                imprimirAlumno(a1);
                imprimirAlumno(a2);
                imprimirAlumno(a3);

                a3 = copiaAlumno(a1);
                imprimirAlumno(a3);

                if (igualAlumno(a1, a2)) {
                    System.out.println("El alumno 1 y el alumno 2 son iguales.");
                } else {
                    System.out.println("El alumno 1 y el alumno 2 no son iguales.");
                }

                if (igualAlumno(a1, a3)) {
                    System.out.println("El alumno 1 y el alumno 3 son iguales.");
                } else {
                    System.out.println("El alumno 1 y el alumno 3 no son iguales.");
                }

            } else if (opcion != 0){
                System.out.println("ERROR: Valor introducido no válido.");
            }
        }while (opcion != 0);
    }

    public static void leerAlumno(Alumno a){
        a.num = Leer.leerEntero("Dame el número del alumno: ");
        a.nombre = Leer.leerTexto("Dame el nombre del alumno: ");
        a.edad = Leer.leerEntero("Dame la edad del alumno: ");
        a.curso = Leer.leerEntero("Dame el curso del alumno: ");
    }

    //De esta manera, ambos métodos pueden implementarse en la clase Alumno sin inconvenientes,
    //ya que solo requieren un argumento. Simplemente sería cuestión de copiarlos y pegarlos dentro
    //de la clase.

    public static void imprimirAlumno (Alumno al){
        System.out.println("--DATOS DEL ALUMNO--");
        System.out.println("Número: " + al.num);
        System.out.println("Nombre: " + al.nombre);
        System.out.println("Edad: " + al.edad);
        System.out.println("Curso: " + al.curso);
    }

    public static Alumno copiaAlumno(Alumno a) {
        a = new Alumno(a);
        return a;
    }
    public static boolean igualAlumno(Alumno a1, Alumno a2) {
        return a1.num == a2.num &&
                a1.nombre == a2.nombre &&
                a1.edad == a2.edad &&
                a1.curso == a2.curso;
    }
}
