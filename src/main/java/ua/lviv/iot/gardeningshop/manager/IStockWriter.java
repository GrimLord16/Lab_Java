package ua.lviv.iot.gardeningshop.manager;

import ua.lviv.iot.gardeningshop.models.Good;

import java.util.List;

public interface IStockWriter {
    void writeToFile(List<Good> goods);
}
