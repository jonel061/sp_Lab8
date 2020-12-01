package models;


import services.Visitee;
import services.Visitor;

public class Autor implements Element, Visitee {
        String name;
        public Autor(String name){
            this.name=name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Author{" +
                    "name='" + name + '\'' +
                    '}';
        }
        public void print(){
            System.out.println(this.name);
        }


        public void accept(BookStatistics stats) {

        }

    @Override
    public void accept(Visitor v) {

    }


}