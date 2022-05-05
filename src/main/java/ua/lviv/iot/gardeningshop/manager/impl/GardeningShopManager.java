package ua.lviv.iot.gardeningshop.manager.impl;

import ua.lviv.iot.gardeningshop.manager.IGardeningShopManager;
import ua.lviv.iot.gardeningshop.models.Good;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class GardeningShopManager implements IGardeningShopManager {
    public List<Good> sortGoodsByCategory(List<Good> goods, boolean descendingOrder) {
        if (descendingOrder) {
            return goods.stream()
                    .sorted(Comparator.comparing(Good::getCategory).reversed())
                    .collect(Collectors.toList());
        }
        return goods.stream()
                .sorted(Comparator.comparing(Good::getCategory))
                .collect(Collectors.toList());

    }

    public List<Good> sortGoodsByQuantity(List<Good> goods, boolean descendingOrder) {
        if (descendingOrder) {
            return goods.stream()
                    .sorted(Comparator.comparing(Good::getQuantity).reversed())
                    .collect(Collectors.toList());
        }
        return goods.stream()
                .sorted(Comparator.comparing(Good::getQuantity))
                .collect(Collectors.toList());

    }

}
