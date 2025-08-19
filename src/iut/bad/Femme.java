package iut.bad;

public class Femme extends Humain {
    public Femme(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public static void main(String[] args) {
        Homme h = new Homme("Rakoto", "Jean", 30);
        Femme f = new Femme("Rasoa", "Marie", 25);

        f.ami(h);  

        f.listerAmis();  
        h.listerAmis();  
    }
}
