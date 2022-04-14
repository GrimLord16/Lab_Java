package ua.lviv.iot.JavaLab;

import java.util.LinkedList;
import java.util.List;

import ua.lviv.iot.JavaLab.manager.impl.GardeningShopManager;
import ua.lviv.iot.JavaLab.models.Fertilizer;
import ua.lviv.iot.JavaLab.models.Good;
import ua.lviv.iot.JavaLab.models.Hose;
import ua.lviv.iot.JavaLab.models.Seeds;

public class Main {

	public static void main(String[] args) {
		GardeningShopManager manager = new GardeningShopManager();
		Hose hose = new Hose("shneider",20,"hose",20);
		Fertilizer fert = new Fertilizer("phosphit",10,"fertilizer",20);
		Seeds seeds = new Seeds("shneider",30,"seeds",50);
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
