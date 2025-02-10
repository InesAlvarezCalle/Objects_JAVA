package ObjectsI;

public class Persona {
    String dni;
    String nombre;
    String apellidos;
    int edad;

    public Persona(String dni, String nombre, String apellidos, int edad){
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrar(){
        String frase = "DNI: " + (dni != null ? dni : "N/A") + ", NOMBRE: " + nombre + ", APELLIDOS: " +
                (apellidos != null ? apellidos : "N/A") + ", EDAD: " + edad;
        System.out.println(frase);
    }

    public boolean esMayorEdad(){
        return edad >= 18;
    }

    public boolean esJubilado(){
        return edad >= 67;
    }

    public int diferenciaEdad(Persona p){
        return Math.abs(this.edad - p.edad);
    }
}
