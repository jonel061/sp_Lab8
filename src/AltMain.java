import commands.Command;
import commands.SaveCommand;
import models.*;

import java.util.ArrayList;
import java.util.List;

public class AltMain {
    public static void main(String[] args)
    {
        Section cap1 = new Section("Cap 1");

        Paragraf p1 = new Paragraf("Paragraf 1", "Text1");
        cap1.add(p1);

        Paragraf p2 = new Paragraf("Paragraf 2", "Text2");
        cap1.add(p2);

        Paragraf p3 = new Paragraf("Paragraph 3", "Text3");
        cap1.add(p3);

        Paragraf p4 = new Paragraf("Paragraph 4", "Text4");
        cap1.add(p4);

        Autor a1 = new Autor("Ion Creanga");
        List<Autor> la = new ArrayList<>();
        la.add(a1);
        Carte c = new Carte(la,"Carte1");
        c.add(cap1);
        Command command = new SaveCommand(c,"savePath.json");
        command.execute();

    }

}