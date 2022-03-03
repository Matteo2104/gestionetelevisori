package it.gestionetelevisori.service.televisore;

import java.util.List;

import it.gestionetelevisori.dao.televisore.TelevisoreDAO;
import it.gestionetelevisori.model.Televisore;

public class TelevisoreServiceImpl implements TelevisoreService {

	private TelevisoreDAO televisoreDAO;

	@Override
	public void setTelevisoreDAO(TelevisoreDAO televisoreDAO) {
		this.televisoreDAO = televisoreDAO;
	}
	
	@Override
	public List<Televisore> trovaDaEsempio(Televisore televisore) {
		return televisoreDAO.findByExample(televisore);
	}
	
	@Override
	public Televisore trovaDaId(Long id) {
		return televisoreDAO.findById(id);
	}
	
	@Override
	public int inserisciNuovo(Televisore televisore) {
		return televisoreDAO.insert(televisore);
	}
	
	@Override
	public List<Televisore> listAll() {
		return televisoreDAO.list();
	}
	
	@Override
	public int rimuovi(Televisore televisore) {
		return televisoreDAO.delete(televisore);
	}
	
	@Override
	public int aggiorna(Televisore televisore) {
		return televisoreDAO.update(televisore);
	}
}
