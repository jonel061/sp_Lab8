package models;

import services.AlignStrategy;
import services.AlignStrategy;
import services.Visitee;
import services.Visitor;

import javax.naming.Context;

public class ImageProxy implements Element, AlignStrategy, Visitee {
    String imageName;
    Imagine realImage;
    private AlignStrategy align;

    //    @Override
//    public void render() {
//        if (realImage == null){
//            realImage = new Imagine(imgname);
//        }
//        realImage.render();
//    }
    public ImageProxy(String imageName){
        this.imageName = imageName;
        this.realImage = null;
    }

    public Imagine getRealImage() {
        if (realImage == null){
            realImage = new Imagine(imageName);
        }
        return realImage;
    }

    public AlignStrategy getAlign() {
        return align;
    }

    public String getImgname() {
        return imageName;
    }

    public void accept(Visitor visitor) {
        visitor.visitImageProxy(this);
    }


    public void render(Paragraf paragraf, Context context) {

    }


    public void setAlignment(Paragraf paragraf, Context context) {

    }

    @Override
    public void add(Element e) {

    }

    @Override
    public void remove(Element e) {

    }

    @Override
    public Element getElement(int i) {
        return null;
    }
}