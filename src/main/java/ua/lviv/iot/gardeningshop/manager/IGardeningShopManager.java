package ua.lviv.iot.gardeningshop.manager;

import ua.lviv.iot.gardeningshop.models.Good;

import java.util.List;

public interface IGardeningShopManager {
    List<Good> sortGoodsByCategory(List<Good> goods, boolean descendingOrder);
    List<Good> sortGoodsByQuantity(List<Good> goods, boolean descendingOrder);
}
