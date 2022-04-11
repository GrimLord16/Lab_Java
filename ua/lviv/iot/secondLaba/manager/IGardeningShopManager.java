package ua.lviv.iot.secondLaba.manager;

import java.util.List;

import ua.lviv.iot.secondLaba.model.Good;

public interface IGardeningShopManager {
	Good sale(String name);
	List<Good> sale(final String name,final int quantity);
	
	List<Good> findByCategory(String category);
	
	List<Good> findByName(String name);
	
	void addGoods(List<Good> goods);
	
	
}
