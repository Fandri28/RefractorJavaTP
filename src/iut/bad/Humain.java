package iut.bad;

import java.util.ArrayList;
import java.util.List;

public class Humain implements Consommation {
    protected String nom;
    protected String prenom;
    protected int age;
    private List<Humain> amis = new ArrayList<>();

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getPrenom() { return prenom; }
    public void setPrenom(String prenom) { this.prenom = prenom; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String toString() {
        return "Nom: " + nom + ", Prénom: " + prenom + ", Âge: " + age;
    }

    public void details() {
        System.out.println(toString());
    }

    @Override
    public void manger() {
        System.out.println(nom + " est en train de manger.");
    }

    @Override
    public void boire() {
        System.out.println(nom + " est en train de boire.");
    }

   
    public void ami(Humain autre, int duree) {
        if (!amis.contains(autre)) {
            amis.add(autre);
            System.out.println(nom + " et " + autre.nom + " sont maintenant amis pour " + duree + " jours.");
        } else {
            System.out.println(nom + " et " + autre.nom + " sont déjà amis.");
        }
    }

 
    public void ami(Humain autre) {
        ami(autre, 100);
    }

    public void listerAmis() {
        System.out.print(nom + " a pour amis : ");
        for (Humain h : amis) {
            System.out.print(h.nom + " ");
        }
        System.out.println();
    }
}
