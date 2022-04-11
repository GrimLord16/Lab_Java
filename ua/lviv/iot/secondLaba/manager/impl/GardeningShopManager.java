package ua.lviv.iot.secondLaba.manager.impl;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import ua.lviv.iot.secondLaba.manager.IGardeningShopManager;
import ua.lviv.iot.secondLaba.model.Good;

public class GardeningShopManager implements IGardeningShopManager{
	
	private Map<String,List<Good>> goodsMap = new HashMap<>();
	
	@Override
	public Good sale(String name) {
		
		return sale(name,1).get(0);
	}
	@Override
	public List<Good> sale(final String name,final int quantity) {
		var goodsToSell = goodsMap.get(name);
		
		if(goodsToSell == null) { return null; }
		
		if(goodsToSell.size() <= quantity) {
			return goodsMap.remove(name);
		}
		
		var soldGoods = new LinkedList<Good>();
		
		for(int i=0; i < quantity; i++) {
			soldGoods.add(goodsToSell.remove(0));
		}
		return soldGoods;
	}

	@Override
	public List<Good> findByCategory(final String category) {
		List<Good> result = new LinkedList<Good>();
		
		for(List<Good> goods:goodsMap.values()) {
			result.addAll(goods.stream().filter(
					good -> good.getCategory().equals(category))
			.collect(Collectors.toList()));
		}
		return result;
	}

	@Override
	public List<Good> findByName(String name) {
		return goodsMap.get(name);
	}

	@Override
	public void addGoods(List<Good> goods) {
		
		goods.forEach(good-> {
			String name = good.getName();
			var existingGoods = goodsMap.get(name);
			if(existingGoods == null) {
				existingGoods = new LinkedList<Good>();
				goodsMap.put(name, existingGoods );
			}
			existingGoods.add(good);
			
		});
		
	}
	
}
