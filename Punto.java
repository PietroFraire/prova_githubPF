public class Punto{
    int x;
    int y;

    public Punto(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setCoord(int addR, int addC){
        this.x += addR;
        this.y += addC;
    }

}