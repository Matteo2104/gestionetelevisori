package it.gestionetelevisori.dao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import it.gestionetelevisori.model.Televisore;

public class DB_Mock {
	public static final List<Televisore> LISTA_TELEVISORI = new ArrayList<>();

	static {
		// preparo una lista mock perché ancora non ho il collegamento alla
		// base dati
		LISTA_TELEVISORI.add(new Televisore(1l, "sony", "000", 300, 1, "mrs111"));
		LISTA_TELEVISORI.add(new Televisore(2l, "samsung", "001", 400, 1, "mrs222"));
		LISTA_TELEVISORI.add(new Televisore(3l, "philips", "002", 500, 1, "mrs333"));
		LISTA_TELEVISORI.add(new Televisore(4l, "samsung", "003", 800, 1, "pppbbb4"));
		LISTA_TELEVISORI.add(new Televisore(5l, "apple", "004", 1000, 1, "plros"));
		LISTA_TELEVISORI.add(new Televisore(6l, "samsung", "005", 450, 1, "mrs366"));
		LISTA_TELEVISORI.add(new Televisore(7l, "acer", "006", 670, 1, "mrs333"));
	}

	public static Long getNexIdAvailable() {
		Long resultId = null;
		if (LISTA_TELEVISORI == null || LISTA_TELEVISORI.isEmpty()) {
			resultId = 1L;
		}
		resultId=LISTA_TELEVISORI.stream().max(Comparator.comparing(Televisore::getId)).get().getId();
		return ++resultId;
	}

}
