package it.gestionetelevisori.service;


import it.gestionetelevisori.service.televisore.TelevisoreService;
import it.gestionetelevisori.service.televisore.TelevisoreServiceImpl;
import it.gestionetelevisori.dao.MyDaoFactory;

public class MyServiceFactory {
	// rendiamo questo factory SINGLETON
	private static TelevisoreService TELEVISORE_SERVICE_INSTANCE;

	public static TelevisoreService getAbitanteServiceInstance() {
		if (TELEVISORE_SERVICE_INSTANCE == null)
			TELEVISORE_SERVICE_INSTANCE = new TelevisoreServiceImpl();

		TELEVISORE_SERVICE_INSTANCE.setTelevisoreDAO(MyDaoFactory.getTelevisoreDAOInstance());

		return TELEVISORE_SERVICE_INSTANCE;
	}
}
