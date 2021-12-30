package exercice1;

class Personne {
    
    /**
     * les attributs de la classe
     */
    public String nom;
    public String prenom;
    public int age;
    public String sexe;


    /**
     * constructors
     */
    public Personne(){}

    public Personne(String nom , String prenom){
        this.nom=nom;
        this.prenom=prenom;

    }
    public Personne(String nom , String prenom,int age){
        this.nom=nom;
        this.prenom=prenom;
        this.age=age;
    }
    public Personne(String nom , String prenom,int age, String sexe){
        this.nom=nom;
        this.prenom=prenom;
        this.age=age;
        this.sexe=sexe;
    }


    public Personne(Personne person){
        this.nom    =   person.nom;
        this.prenom =   person.prenom;
        this.age    =   person.age;
        this.sexe   =   person.sexe;
    }

    public String toString(){
        
        return "Description : \nPrenom : "+this.prenom+" Nom : "+this.nom+" age : "+this.age+" sexe : "+this.sexe ;
    }
}