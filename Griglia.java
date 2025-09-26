public class Griglia{
    private int dimensioneR;
    private int dimensioneC;

    public Griglia(int dimensioneR, int dimensioneC){
    this.dimensioneR = dimensioneR;
    this.dimensioneC = dimensioneC;
    }
    public int getDim(){
        return this.dimensioneR;
    }

    public int getDim2(){
        return this.dimensioneC;
    }


    public void stampa(int x, int y) {
    for (int i = 0; i < dimensioneR; i++) {
        for (int j = 0; j < dimensioneC; j++) {
            System.out.print("["); // bordo iniziale della riga
            if(i == x && j == y){
                System.out.print("S"); // cella e bordo verticale
            }
            else
                System.out.print("."); // bordo iniziale della riga
            System.out.print("]"); // bordo iniziale della riga
        }
        System.out.println(); // vai a capo alla fine della riga 
    }
    }
    
    public int mossa(Punto p, int sR, int sC){
        int i, r = 0, stop = 0;
        if(p.x == sR && p.y == sC){
            r = 1;
            return r ; 
        }
        else{
            Punto p1 = new Punto(p.x, p.y);
            for(i = 0; stop != 1 && i<4; i++){
                p1 = p1.sposta(p,i);
                if(p1.x != p.x || p1.y != p.y){

                }

            }

        }
        return 1; // da continuare
    }



    
}

