package ua.lviv.iot.datesRecorder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DateRecorderTest {

    @BeforeEach
    void setUp() {

    }

    @Test
    void recordDatesTest() {
        String result = DateRecorder.recordDates();
        String expected = "28/2/2004\n" +
                "31.1.2010\n";
        Assertions.assertEquals(result, expected);

    }
}