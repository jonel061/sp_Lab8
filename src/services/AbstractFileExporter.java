
/*
package services;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;

abstract class AbstractFileExporter implements Exporter<Visitee> {
        private final String fileName = null;
        @Override
        public Iterable<Visitee> export(Iterable<Visitee> entities) {
            try(BufferedWriter bos = Files.newBufferedWriter(Paths.get(fileName))) {
                processEntities(bos, entities);
            }
            catch (IOException ex) {
                ex.printStackTrace();
            }
            return entities;
        }
        protected abstract void processEntities(Writer writer, Iterable<Visitee> entities) throws IOException;
}
*/