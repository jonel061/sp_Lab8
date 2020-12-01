package commands;

import models.BookStatistics;

public class StatisticsCommand implements Command{

    public void execute() {
        System.out.println("Getting book statistics...");

        if (DocumentManager.getInstance().getCarte() != null) {
            BookStatistics s = new BookStatistics();
            DocumentManager.getInstance().getCarte().accept(s);
            s.printStatistics();
        }
        else
            System.out.println("There is no book");
    }
}