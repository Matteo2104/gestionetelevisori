package it.gestionetelevisori.dao;

import java.util.List;

import it.gestionetelevisori.model.Televisore;

public interface IBaseDAO<T> {
	public List<T> list();
	public int insert(Televisore input);
	public int delete(Televisore input);
	public int update(Televisore input);
	
	public List<T> findByExample(Televisore input);
}
