public class mpikabary {

    String nom;
    String prenom;
    String village;
    String heure;
    int anne;
    String avis;
    String intro;
    String kabary;
    double[] note;



    boolean chevauchement = false;
    String[] juryref = new String[3];
    double[] moyenneCourt = new double[3];
    boolean valide = false;
    double[] moyennemidi14 = new double[3];


    


    public mpikabary(String nom, String prenom, String village, String heure, int anne, String avis, String intro, String kabary, double[] note) {
        this.nom = nom;
        this.prenom = prenom;
        this.village = village;
        this.heure = heure;
        this.anne = anne;
        this.avis = avis;
        this.intro = intro;
        this.kabary = kabary;
        this.note = note;
    }

    public double moyenne(double[] note) {
        double somme = 0;
        for (int i = 0; i < note.length; i++) {
            somme += note[i];
        }
        return somme / note.length;

    }


    public double DureeKabary() {
        double duree = 0;
        for (int i = 0; i < kabary.length(); i++) {
            if((kabary.charAt(i) == ' ') || (kabary.charAt(i) == ',') || (kabary.charAt(i) == ';')) {
                duree += 0.5;
            }
        }
        return duree;
    }
}