package it.gestionetelevisori.service.televisore;

import java.util.List;

import it.gestionetelevisori.dao.televisore.TelevisoreDAO;
import it.gestionetelevisori.model.Televisore;

public interface TelevisoreService {

	public void setTelevisoreDAO(TelevisoreDAO televisoreDAO);

	public List<Televisore> trovaDaEsempio(Televisore televisore);

	public Televisore trovaDaId(Long id);

	public int inserisciNuovo(Televisore televisore);

	public List<Televisore> listAll();

	public int rimuovi(Televisore televisore);
}
