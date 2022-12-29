
package enterprise;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

        long startTime = System.currentTimeMillis();

        String websiteUrl = "https://www.foodtown.com/";
        String outputFolder = "data/links.txt";
        int resultsCount = 20;

        Scraper scraper = new Scraper(websiteUrl, resultsCount);
        Thread scraperThread = new Thread(scraper);

        scraperThread.start();
        scraperThread.join();

        writeTxt(scraper.getLinks(), outputFolder);

        long finishTime = System.currentTimeMillis();
        double seconds = (finishTime - startTime) / 1000D;

        System.out.println("Completed in " + seconds + " seconds");
    }

    public static void writeTxt(Collection<String> collection, String outputFolder) throws IOException {

        FileWriter writer = new FileWriter(outputFolder);

        for(String string : collection) {
            writer.write(string + "\n");
        }
        writer.close();

        System.out.println("TXT FILE IS DONE");
    }
}
