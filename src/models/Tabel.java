package models;

import services.AlignStrategy;
import services.Visitor;

import javax.naming.Context;

public class Tabel implements Element, AlignStrategy {
    String nume;
    private AlignStrategy align;

    public Tabel(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public AlignStrategy getAlign() {
        return align;
    }
    //    @Override
//    public void render(){
//        System.out.print("Tabel \n");
//    }

    @Override
    public void accept(Visitor v) {
        v.visitTable(this);
    }



    @Override
    public void render(Paragraf paragraf, Context c) {

    }

    @Override
    public void setAlignment(Paragraf p, Context c) {

    }
}