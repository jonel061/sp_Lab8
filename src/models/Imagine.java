package models;
import services.AlignStrategy;
import services.AlignStrategy;
import services.Visitee;
import services.Visitor;

import java.util.concurrent.TimeUnit;

import java.util.concurrent.TimeUnit;

public class Imagine implements Element, Visitee {
    String nume;
    public Imagine(String nume){
        this.nume=nume;
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getNume() {
        return nume;
    }

    @Override
    public String toString() {
        return "Image{" +
                "nume='" + nume + '\'' +
                '}';
    }

    public void setName(String nume) {
        this.nume = nume;
    }
    public void print() {
        System.out.println("Image: "+nume);
    }


    public void accept(BookStatistics stats) {
        stats.visit(this);
    }

    @Override
    public void accept(Visitor v) {

    }
}