package services;

import models.Paragraf;

import javax.naming.Context;

public class AlignCenter implements AlignStrategy{
    // TO-DO: ATRIBUTE


    @Override
    public void render(Paragraf p, Context c) {
        System.out.println("Render from AlignRight.");
    }


    public void setAlignment(Paragraf p, Context c) {
        System.out.println(p + " has been aligned to the center.");
    }

    @Override
    public String toString() {
        return "center";
    }
}