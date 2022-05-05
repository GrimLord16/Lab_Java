package ua.lviv.iot.term2;

import java.util.LinkedList;
import java.util.List;

import ua.lviv.iot.term2.manager.impl.GardeningShopManager;
import ua.lviv.iot.term2.model.Fertilizer;
import ua.lviv.iot.term2.model.Good;
import ua.lviv.iot.term2.model.Hose;
import ua.lviv.iot.term2.model.Seeds;



public class Main {

	public static void main(String[] args) {
		GardeningShopManager manager = new GardeningShopManager();
		Hose hose = new Hose("shneider",20,"hoses",20);
		Fertilizer fert = new Fertilizer("phosphit",10,"fertilizers",5);
		Seeds seeds = new Seeds("tomato seeds",30,"seeds",50);
		List<Good> list = new LinkedList<>();
	    list.add(hose);
	    list.add(fert);
	    list.add(seeds);
	    
	    List<Good> sortedGoodsByCategory = manager.sortGoodsByCategory(list, false);
        sortedGoodsByCategory.forEach(System.out::println);
        
        System.out.println("");

        List<Good> sortedGoodsByQuantity = manager.sortGoodsByQuantity(list, true);
        sortedGoodsByQuantity.forEach(System.out::println);

	}

}
