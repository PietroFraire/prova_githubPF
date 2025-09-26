public class Punto{
    int x;
    int y;
    int[] mosseR = {0,-1,0,1};
    int[] mosseC = {-1,0,1,0};

    public Punto(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Punto sposta(Punto punto, int i){
        Punto p = new Punto(0,0);

        if((punto.x += punto.mosseR[i]) != 7 && (punto.y += punto.mosseC[i]) != 7){
            p.x = punto.x + punto.mosseR[i];
            p.y = punto.y + punto.mosseC[i];
            return p;

        }
        return punto;
    
    }


}