package commands;

import models.Carte;
import services.JsonVisitor;
import services.Visitor;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

public class SaveCommand implements Command{
    private final Carte carte;
    private final String path;
    public SaveCommand(Carte c, String savePath) {
        this.carte = c;
        this.path = savePath;
    }

    @Override
    public void execute() {

        Visitor<String> visit = new JsonVisitor();
        String s = visit.visitBook(carte);

        try(BufferedWriter writer = Files.newBufferedWriter(Paths.get(path)))
        {
            writer.write(s);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}