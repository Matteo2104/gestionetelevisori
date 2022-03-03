package it.gestionetelevisori.model;

public class Televisore {
	private Long id;
	private String marca;
	private String modello;
	private int prezzo;
	private int numeroCodici;
	private String codice;
	
	public Televisore() {}
	public Televisore(Long id, String marca, String modello, int prezzo, int numeroCodici, String codice) {
		this.id = id;
		this.marca = marca;
		this.modello = modello;
		this.prezzo = prezzo;
		this.numeroCodici = numeroCodici;
		this.codice = codice;
	}
	
	public Long getId() {
		return id;
	}
	public String getMarca() {
		return marca;
	}
	public String getModello() {
		return modello;
	}
	public int getPrezzo() {
		return prezzo;
	}
	public int getNumeroCodici() {
		return numeroCodici;
	}
	public String getCodice() {
		return codice;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}
	public void setNumeroCodici(int numeroCodici) {
		this.numeroCodici = numeroCodici;
	}
	public void setCodice(String codice) {
		this.codice = codice;
	}
	
	@Override
	public String toString() {
		return "Televisore [id=" + id + ", marca=" + marca + ", modello=" + modello + ", prezzo=" + prezzo
				+ ", numeroCodici=" + numeroCodici + ", codice=" + codice + "]";
	}
}
