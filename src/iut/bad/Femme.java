package iut.bad;

public class Femme extends Humain {
    public Femme(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public static void main(String[] args) {
        Femme f1 = new Femme("Rasoa", "Marie", 25);
        Femme f2 = new Femme("Hanta", "Lina", 27);
        Homme h1 = new Homme("Rakoto", "Jean", 30);

        f1.ami(f2);
        f1.ami(h1);

        f1.listerAmis();
        f2.listerAmis();
        h1.listerAmis();
    }
}
