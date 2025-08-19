package iut.bad;

public class Homme extends Humain {
    public Homme(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public static void main(String[] args) {
        Homme h1 = new Homme("Rakoto", "Jean", 30);
        Homme h2 = new Homme("Andry", "Paul", 28);
        Femme f1 = new Femme("Rasoa", "Marie", 25);

        h1.ami(h2);
        h1.ami(f1);

        h1.listerAmis();
        h2.listerAmis();
        f1.listerAmis();
    }
}
