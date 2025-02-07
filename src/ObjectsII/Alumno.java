package ObjectsII;

class Alumno {
    int num;
    String nombre;
    int edad;
    int curso;

    Alumno() {
        this.num = 0;
        this.nombre = "";
        this.edad = 0;
        this.curso = 0;
    }

    Alumno(int num, String nombre, int edad, int curso) {
        this.num = num;
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
    }

    Alumno(Alumno a) {
        this.num = a.num;
        this.nombre = a.nombre;
        this.edad = a.edad;
        this.curso = a.curso;
    }
    /*
    public static void imprimirAlumno(Alumno al) {
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
    */
}
