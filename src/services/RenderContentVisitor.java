package services;

import models.*;

public class RenderContentVisitor implements Visitor<String> {
    @Override
    public String visitBook(Carte carte) {
        System.out.println("Sunt o carte");
        return carte.getTitlu();
    }

    @Override
    public String visitParagraf(Paragraf paragraf) {
        return null;
    }

    @Override
    public String visitSection(Section s) {
        return null;
    }



    @Override
    public String visitImageProxy(ImageProxy imgProxy) {
        return null;
    }



    @Override
    public String visitTable(Tabel table) {
        return null;
    }

    @Override
    public Integer visitAutor(Autor autor) {
        return null;
    }

    @Override
    public String visitImagine(Imagine image) {
        return null;
    }
}
