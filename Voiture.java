package Voiture;

public class Voiture {
    private static int dernierId = 0;

    private int id;
    private String marque;
    private double vitesse;
    private double puissance;

    // Constructeur
    public Voiture(String marque, double vitesse, double puissance) {
        this.id = ++dernierId;
        this.marque = marque;
        this.vitesse = vitesse;
        this.puissance = puissance;
    }

    // Accesseurs (getters)
    public int getId() {
        return id;
    }

    public String getMarque() {
        return marque;
    }

    public double getVitesse() {
        return vitesse;
    }

    public double getPuissance() {
        return puissance;
    }

    // Mutateurs (setters)
    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setVitesse(double vitesse) {
        this.vitesse = vitesse;
    }

    public void setPuissance(double puissance) {
        this.puissance = puissance;
    }

    // Méthode toString pour afficher les informations de la voiture
    public String toString() {
        return "Voiture [id=" + id + ", marque=" + marque + ", vitesse=" + vitesse + ", puissance=" + puissance + "]";
    }

    public static void main(String[] args) {
        // Création d'objets Voiture et affichage de leurs informations
        Voiture voiture1 = new Voiture("Toyota", 180, 150);
        Voiture voiture2 = new Voiture("Honda", 200, 170);

        System.out.println(voiture1);
        System.out.println(voiture2);

        // Modification des attributs d'une voiture
        voiture1.setMarque("Nissan");
        voiture1.setVitesse(190);

        System.out.println(voiture1);
    }
}

