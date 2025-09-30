public class Griglia{
    private int dimensioneR;
    private int dimensioneC;
    private int found;
    private casella casella[][];

    public Griglia(int dimensioneR, int dimensioneC){
    this.dimensioneR = dimensioneR;
    this.dimensioneC = dimensioneC;
    this.found = 0;
    this.casella = new casella[dimensioneR][dimensioneC];

    for(int i = 0; i<dimensioneR; i++){
        for(int j = 0; j<dimensioneC; j++){
            this.casella[i][j] = new casella();
        }
    }
    }
    public int getDim(){
        return this.dimensioneR;
    }

    public int getDim2(){
        return this.dimensioneC;
    }


    public void stampa(int sR, int sC) {
    for (int i = 0; i < dimensioneR; i++) {
        for (int j = 0; j < dimensioneC; j++) {
            if(i == sR && j == sC){
                casella[i][j].stampa_seme();
            }
            else
                casella[i][j].stampa_casella();
        }
        System.out.println(); // vai a capo alla fine della riga 
    }
    }

    public int sposta(int i,Punto p,int dimensioneR, int dimensioneC, int sR, int sC){
        int[] mosseR = {0,-1,0,1};
        int[] mosseC = {-1,0,1,0};

        int x,y;
        x = p.x + mosseR[i];
        y = p.y + mosseC[i];

        if((x<0 || y <0) || (x >= dimensioneR || y >= dimensioneC) || (casella[x][y].isVisited() == true)){
            return -1;
        }
        else if( x == sR && y == sC){
            p.x = x;
            p.y = y; 
            return 1;
        }

        
            p.x = x;
            p.y = y;
            casella[x][y].setVisited(true);
            return 0;
        
    }

    public void mossa(int terminale, int sR, int sC, Punto p){
        int i,r = 0 ;
        casella[p.x][p.y].setVisited(true);

        if(terminale == 1){
            stampa(sR, sC);
            found=1;
            return;
        }

        for(i = 0; found!=1 && i<4;i++){
            r = sposta(i, p, dimensioneR, dimensioneC, sR, sC);
            if (r == 1){
                mossa(1,sR,sC,p);
            }
            if(r == 0){
                mossa(0,sR,sC,p);
            }
        }
        casella[p.x][p.y].setVisited(false);
        return;
    }

}