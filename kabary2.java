public class kabary2 {
    public static void main(String[] args) {

        
String[] mpikabary = new String[3];
String[] village = new String[3];
String[] heure = new String[3];
int[] longueur = new int[3];
double[] note1 = new double[3];
double[] note2 = new double[3];
double[] note3 = new double[3];
double[] moyenne = new double[3];
boolean chevauchement = false;
String[] juryref = new String[3];
double[] moyenneCourt = new double[3];
boolean valide = false;
double[] moyennemidi14 = new double[3];

mpikabary[0] = "Rakoto";
village[0] = "Ambohimanga";
heure[0] = "10:00";
longueur[0] = 15;
note1[0] = 17;
note2[0] = 18;
note3[0] = 19;

mpikabary[1] = "Fanja";
village[1] = "Andoharanofotsy";
heure[1] = "12:15";
longueur[1] = 15;
note1[1] = 16;
note2[1] = 17;
note3[1] = 18;

mpikabary[2] = "Lova";
village[2] = "Sabotsy Namehana";
heure[2] = "14:30";
longueur[2] = 15;
note1[2] = 15;
note2[2] = 16;
note3[2] = 17;

juryref[0] = "Jury 1";
juryref[1] = "Jury 2";
juryref[2] = "Jury 3";


for(int i = 0; i < 3; i++) {
    moyenne[i] = (note1[i] + note2[i] + note3[i]) / 3;
    }

double meilleureMoyenne = moyenne[0];
int index=0;
for(int i = 1; i < 3; i++) {
    if(moyenne[i] > meilleureMoyenne) {
        index=i;
    }
}
System.out.println("\nMeilleur mpikabary est " + mpikabary[index]+" du vilage "+village[index]+" avec "+moyenne[index]+" de moyenne\n");



for(int i=0;i<3;i++){
    for(int j=0;j<3;j++){
        if(heure[i].equals(heure[j]) && i!=j){
            chevauchement=true;
            System.out.println(" Kabary de mpikabary "+mpikabary[i]+" et "+mpikabary[j]+" se chevauchent.\n");
        }
    }
}
if (!chevauchement) {
    System.out.println("Pas de chevauchement de Kabary\n");
}

String juryPlus10= juryref[0];
double noteMax=moyenneCourt[0];
for(int i=0;i<3;i++){
    if(note1[i]>noteMax){
        noteMax=note1[i];
        juryPlus10=juryref[i];
    }
}

for(int k=0;k<3;k++){
    if(longueur[k]<10){
        moyenneCourt[k]+=moyenne[k];
        valide=true;
    }
}

if (valide){
    System.out.println("Le jury qui donne plus de note en moyenne pour les discours courts que longs est: "+juryPlus10+".\n");
}else{
    System.out.println("Aucun jury n'a donné de note pour les discours courts\n");
}

 


        valide = false;
        int[] nbDiscoursMidi14 = new int[3];

        for (int m = 0; m < 3; m++) {
            int heureDiscours = Integer.parseInt(heure[m].substring(0, 2));

            if (heureDiscours >= 12 && heureDiscours <= 14) {
                moyennemidi14[m] += moyenne[m];
                nbDiscoursMidi14[m]++;
                valide = true;
            }
        }

        juryPlus10 = "";
        noteMax = -1;
        for (int n = 0; n < 3; n++) {
            if (nbDiscoursMidi14[n] > 0) {
                double moyenneMidi14 = moyennemidi14[n] / nbDiscoursMidi14[n];
                if (moyenneMidi14 > noteMax) {
                    noteMax = moyenneMidi14;
                    juryPlus10 = juryref[n];
                }
            }
        }

        if (valide) {
            System.out.println("Le jury qui donne plus de note en moyenne pour les discours entre midi et 14h est : " + juryPlus10 + ".\n");
        } else {
            System.out.println("Aucun jury n'a donné de note pour les discours entre midi et 14h\n");
        }
    }
}
