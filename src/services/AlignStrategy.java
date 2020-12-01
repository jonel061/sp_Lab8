package services;

import models.Paragraf;

import javax.naming.Context;

public interface AlignStrategy {
    void render(Paragraf p, Context c);
    void setAlignment(Paragraf p, Context c);

}