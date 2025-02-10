package ObjectsI;

public class Punto {
    int x;
    int y;

    Punto(){
        this.x = 0;
        this.y = 0;
    }

    Punto(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void mostrar(){
        System.out.println("(" + this.x + ", " + this.y + ")");
    }

    public void desplaza(int d, boolean horizontal){
        if(horizontal){
            this.x += d;
        } else {
            this.y += d;
        }
    }
}
