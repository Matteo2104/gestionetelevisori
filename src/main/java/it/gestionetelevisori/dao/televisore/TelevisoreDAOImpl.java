package it.gestionetelevisori.dao.televisore;

import java.util.ArrayList;
import java.util.List;

import it.gestionetelevisori.dao.DB_Mock;
import it.gestionetelevisori.model.Televisore;

public class TelevisoreDAOImpl implements TelevisoreDAO  {

	@Override
	public List<Televisore> list() {
		return DB_Mock.LISTA_TELEVISORI;
	}

	@Override
	public int insert(Televisore input) {
		return DB_Mock.LISTA_TELEVISORI.add(input)?1:0;
	}

	@Override
	public int delete(Televisore input) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Televisore input) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Televisore> findByExample(Televisore input) {
		List<Televisore> resultList = new ArrayList<>();
		
		for (Televisore televisore : DB_Mock.LISTA_TELEVISORI) {
			if (input.getMarca() != null && televisore.getMarca().equals(input.getMarca())) {
				resultList.add(televisore);
				continue;
			}
			if (input.getModello() != null && televisore.getModello().equals(input.getModello())) {
				resultList.add(televisore);
				continue;
			}
			if (input.getPrezzo() != null && televisore.getPrezzo().equals(input.getPrezzo())) {
				resultList.add(televisore);
				continue;
			}
			if (input.getNumeroCodici() != null && televisore.getNumeroCodici().equals(input.getNumeroCodici())) {
				resultList.add(televisore);
				continue;
			}
			if (input.getCodice() != null && televisore.getCodice().equals(input.getCodice())) {
				resultList.add(televisore);
				continue;
			}
		}
		
		return resultList;
	}
	
	public Televisore findById(Long id) {
		for (Televisore televisore : DB_Mock.LISTA_TELEVISORI) {
			if (televisore.getId() == id) {
				return televisore;
			}
		}
		return null;
	}

}
