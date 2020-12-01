package commands;

import commands.Command;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class OpenCommand implements Command {

    private final String path;

    OpenCommand(String path)
    {
        this.path = path;
    }
    @Override
    public void execute() {
        try(BufferedReader reader = Files.newBufferedReader(Paths.get(path)))
        {


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}