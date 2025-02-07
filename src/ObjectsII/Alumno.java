package ObjectsII;

class Alumno {
    int num;
    String nombre;
    int edad;
    int curso;

    Alumno(){
        this.num = 0;
        this.nombre = "";
        this.edad = 0;
        this.curso = 0;
    }

    Alumno(int num, String nombre, int edad, int curso){
        this.num = num;
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
    }

    Alumno (Alumno a){
        this.num = a.num;
        this.nombre = a.nombre;
        this.edad = a.edad;
        this.curso = a.curso;
    }
}
