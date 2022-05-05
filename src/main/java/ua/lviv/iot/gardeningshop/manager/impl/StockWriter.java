package ua.lviv.iot.gardeningshop.manager.impl;

import ua.lviv.iot.gardeningshop.manager.IStockWriter;
import ua.lviv.iot.gardeningshop.models.Good;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class StockWriter implements IStockWriter {
    public void writeToFile(List<Good> goods) {
        try {
            File file = new File(String.format("%s%s%s%s%s", System.getProperty("user.dir"), File.separator, "src\\main\\resources", File.separator, "result.csv"));
            file.createNewFile();
            FileWriter writer = new FileWriter(file);
            for (Good good : goods) {
                writer.write(good.getHeader());
                writer.write(good.toCSV());
            }
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
