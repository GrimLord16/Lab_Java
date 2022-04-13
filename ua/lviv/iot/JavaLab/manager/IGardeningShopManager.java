package ua.lviv.iot.JavaLab.manager;

import java.util.List;

import ua.lviv.iot.JavaLab.models.Good;

public interface IGardeningShopManager {
	Good sale(String name);
	List<Good> sale(final String name,final int quantity);
	
	List<Good> findByCategory(String category);
	
	List<Good> findByName(String name);
	
	void addGoods(List<Good> goods);
	
	List<Good> sortGoodsByCategory(List<Good> goods, boolean descendingOrder);
	List<Good> sortGoodsByQuantity(List<Good> goods, boolean descendingOrder);
}
