package ObjectsI;

public class Rectangulo {
    int x1, x2, y1, y2;

    public Rectangulo (int x1, int x2, int y1, int y2){
        if(x1 < x2 && y1 < y2){
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        } else {
            System.out.println("ERROR: Las coordenadas no definen un rectángulo válido");
        }
    }

    public void mostrar(){
        System.out.println("Rectángulo [Esquina abajo izquierda: (" + x1 + ", " + y1 + ") - Esquina arriba derecha: ("
        + x2 + ", " + y2 + ")]");
    }

    public int perimetro(){
        int ancho = x2 - x1;
        int altura = y2 - y1;
        return 2 * (ancho + altura);
    }

    public int area(){
        int ancho = x2 - x1;
        int altura = y2 - y1;
        return ancho * altura;
    }
}
