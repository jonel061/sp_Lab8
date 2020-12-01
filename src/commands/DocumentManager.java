package commands;

import models.Carte;


public class DocumentManager {
    public static DocumentManager instance;
    private Carte carte;

    public static DocumentManager getInstance() {
        return instance;
    }

    public Carte getCarte() {
        return carte;
    }

    public void setCarte(Carte carte) {
        this.carte = carte;
    }
}