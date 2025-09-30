public class casella{
    private char parentesiA;
    private char parentesiC;
    private char punto;
    private boolean visited;

    public casella(){
        this.parentesiA = '[';
        this.parentesiC = ']';
        this.punto = '.';
        this.visited = false;
    }

    public void setVisited(boolean value){
        this.visited = value;

    }

    public boolean isVisited(){
        return this.visited;
    }

    public void stampa_casella(){
        System.out.print(this.parentesiA);
        if(this.visited != true)
            System.out.print(this.punto);
        else
            System.out.print("#");
        System.out.print(this.parentesiC);
    }

    public void stampa_seme(){
        System.out.print(this.parentesiA);
        System.out.print("S");
        System.out.print(this.parentesiC);

    }



}