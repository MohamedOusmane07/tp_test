package tp;

import java.util.ArrayList;
import java.util.List;

public class GestionnaireMots {

    public List<String> mots;

    public GestionnaireMots() {
        this.mots = new ArrayList<>();
    }

    public void addMot(String mot) {
       if (mot==null || mot.trim().isEmpty()){
           throw new IllegalArgumentException("Le mot ne peut pas être vide");
       }
       this.mots.add(mot);
    }

    public boolean removeMot(String mot) {
        return this.mots.remove(mot);
    }

    public boolean containMot(String mot) {
        return this.mots.contains(mot);
    }

    public int countMots() {
        return this.mots.size();
    }

    public void clearMots() {
        this.mots.clear();
    }

}
