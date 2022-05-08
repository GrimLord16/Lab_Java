package ua.lviv.iot.gardeningshop.manager.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.gardeningshop.models.Fertilizer;
import ua.lviv.iot.gardeningshop.models.Good;
import ua.lviv.iot.gardeningshop.models.Hose;
import ua.lviv.iot.gardeningshop.models.Seeds;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StockWriterTest {

    private final Hose hose = new Hose("shneider",20,"hoses",20);
    private final Fertilizer fert = new Fertilizer("phosphate",10,"fertilizers",5);
    private final Seeds seeds = new Seeds("tomato seeds",30,"seeds",50);

    @BeforeEach
    void setUp() {
    }
       @Test
    void writeToFileTest() {
        List<Good> listTest = Arrays.asList(fert, hose, seeds);
        StockWriter writer = new StockWriter();
        writer.writeToFile(listTest);

        String readerEx = String.format("%s%s%s%s%s", System.getProperty("user.dir"), File.separator, "src\\test\\resources", File.separator, "expected.csv");
        String readerRes = String.format("%s%s%s%s%s", System.getProperty("user.dir"), File.separator, "src\\main\\resources", File.separator, "result.csv");

        try {
            BufferedReader readerResult = new BufferedReader(new FileReader(readerRes));
            BufferedReader readerExpected = new BufferedReader(new FileReader(readerEx));
            assertEquals(readerExpected.readLine(), readerResult.readLine());
            assertNotEquals(null, readerResult.readLine());
            assertNotEquals(readerExpected.readLine(), null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

   /* @Test
    void writeCSV() throws IOException {
        try (FileReader expectedReader = new FileReader("src/test/resources/expected.csv");
             BufferedReader expectedBR = new BufferedReader(expectedReader);
             FileReader actualReader = new FileReader("src/main/resources/result.csv");
             BufferedReader actualBR = new BufferedReader(actualReader)) {
            String line1 = expectedBR.readLine();
            String line2 = actualBR.readLine();
            Assertions.assertEquals(line1, line2);
        }
    }*/
}