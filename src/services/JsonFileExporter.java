/*
package services;
import models.*;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonFileExporter {
    private final String fileName;
    private final JsonVisitor visitor;
    @Override
    public Iterable<T> export(Iterable<T> entities) {
        try(BufferedWriter bos = Files.newBufferedWriter(Paths.get(fileName))) {
            for(T o : entities) {
                bos.write(o.accept(visitor));
            }
        }
        catch (IOException ioex) {
            ioex.printStackTrace();
        }
        return entities;
    }
}*/