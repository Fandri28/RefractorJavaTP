package iut.bad;

public class Homme extends Humain {
    public Homme(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public static void main(String[] args) {
        Homme h = new Homme("Rakoto", "Jean", 30);
        h.details();
        h.manger();
        h.boire();
    }
}
