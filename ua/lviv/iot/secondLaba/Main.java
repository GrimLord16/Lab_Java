package ua.lviv.iot.secondLaba;

import java.util.LinkedList;
import java.util.List;


import ua.lviv.iot.secondLaba.model.Fertilizer;
import ua.lviv.iot.secondLaba.model.Good;
import ua.lviv.iot.secondLaba.model.Hose;
import ua.lviv.iot.secondLaba.model.Seeds;

public class Main {

	public static void main(String[] args) {
		Hose hose = new Hose("Shnider",20,"hoses",20);
		Fertilizer fert = new Fertilizer("Phosphid", 30,"fertilizers",20);
		Seeds seeds = new Seeds("Tomato seeds", 30 , "seeds",28);

	}

}
