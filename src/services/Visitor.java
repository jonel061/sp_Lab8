package services;


import models.*;

public interface Visitor<T> {

    String visitBook(Carte carte);

    T visitParagraf(Paragraf paragraf);
    T visitSection(Section section);
    T visitTable(Tabel tabel);

    Integer visitAutor(Autor autor);

    T visitImagine(Imagine image);
    T visitImageProxy(ImageProxy imageProxy);
}
