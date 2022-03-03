package it.gestionetelevisori.model;

public class Televisore {
	private Long id;
	private String marca;
	private String modello;
	private Integer prezzo;
	private Integer numeroCodici;
	private String codice;
	
	public Televisore() {}
	public Televisore(Long id, String marca, String modello, Integer prezzo, Integer numeroCodici, String codice) {
		this.id = id;
		this.marca = marca;
		this.modello = modello;
		this.prezzo = prezzo;
		this.numeroCodici = numeroCodici;
		this.codice = codice;
	}
	public Televisore(String marca, String modello, int prezzo, int numeroCodici, String codice) {
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
	public Integer getPrezzo() {
		return prezzo;
	}
	public Integer getNumeroCodici() {
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
	public void setPrezzo(Integer prezzo) {
		this.prezzo = prezzo;
	}
	public void setNumeroCodici(Integer numeroCodici) {
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
