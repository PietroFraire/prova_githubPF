package prova_singleton;


public class Main {
    public static void main(String args[]){
    

    Singleton persona = Singleton.getInstance();

    // creo un riferimento ad una classe singleton, poi chiamo il metodo statico che appartiene alla classe 

    // NOTA:: se non avessi reso statica la classe la scrittura Singleton.getInstance(); sarebbe stata errata, è corretta in questo caso
    // perchè il metodo appartiene alla classe, di seguito un esempio nel caso il metodo fosse stato non statico

    /*public Singleton persona;

    public Singleton persona1 = persona.getInstance(); */
    
    Singleton persona1 = Singleton.getInstance();

    // in questo caso, essendo stata già create l'istanza, persona1 punterà alla stessa area di memoria a cui punta persona


    System.out.println(persona.getName());
    System.out.println(persona1.getName());
    
    }
}
