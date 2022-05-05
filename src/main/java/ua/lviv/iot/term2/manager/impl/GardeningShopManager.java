package ua.lviv.iot.term2.manager.impl;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import ua.lviv.iot.term2.manager.IGardeningShopManager;
import ua.lviv.iot.term2.model.Good;

public class GardeningShopManager implements IGardeningShopManager{
	
	/*
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
*/
	
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
