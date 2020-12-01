
package services;
import models.*;

import java.util.stream.Collectors;

public class JsonVisitor implements Visitor<String> {

    @Override
    public String visitBook(Carte carte) {
        String autori = carte.getAutori().stream().map(autor -> autor.getName()).collect(Collectors.joining(","));
        String s = String.format("{\"autori\":[%s], \"details\":%s}", autori, carte.getSectionTitle());
        return s;
    }

    @Override
    public String visitParagraf(Paragraf paragraf) {
        if (paragraf.getTextAlignment() != null) {
            String s = String.format("{\"text\": \"%s\", \"alignment\": \"%s\" }", paragraf.getText(), paragraf.getTextAlignment());
            return s;
        } else {
            String s = String.format("{\"text\": \"%s\", \"alignment\": \"%s\" }", paragraf.getText(), "No text alignment");
            return s;
        }
    }
    @Override
    public String visitSection(Section section) {
        return null;
    }

    @Override
    public String visitTable(Tabel tabel) {
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

    @Override
    public String visitImageProxy(ImageProxy imageProxy) {
        return null;
    }
}
