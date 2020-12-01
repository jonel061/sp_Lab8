/*
package services;

import java.io.IOException;
import java.io.Writer;

public class FileExporterWithVisitor extends AbstractFileExporter {
    private final Visitor<String> visitor;
    public FileExporterWithVisitor(String fileName, Visitor<String> visitor) {
        super(fileName);
        this.visitor = visitor;
    }
    @Override
    protected void processEntities(Writer writer, Iterable<Visitee> entities) throws IOException {
        for(Visitee o : entities) {
            writer.write(o.accept(visitor));
        }
    }
}
*/