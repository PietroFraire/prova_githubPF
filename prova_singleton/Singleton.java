package prova_singleton;

public class Singleton {
    private static Singleton istanza;  // unica istanza della classe, resa statica perchè appartenga alla classe
    // la classe quindi mantiene un riferimento di memoria occupata dall'unica istanza che possiede
    // dopo si inseriscono gli attributi della classe

    // questo viene fatto perchè la classe deve poter essere in grado di ritornare il suo unico riferimento

    private String nome;
    private String cognome;
    private int numero;

    private Singleton(String nome, String cognome, int numero){
        this.nome = nome;
        this.cognome = cognome;
        this.numero = numero;
    }

    public static Singleton getInstance(){
        if(istanza == null){
            istanza = new Singleton("Mario","Rossi", 1); // se è il primo creo l'istanza    
        }
        return istanza;
    }

    public String  getName(){
        return istanza.nome;
    }
    public String  getSurname(){
        return istanza.cognome;
    }
    public int getNumero(){
        return istanza.numero;
    }
}
