package it.prova.listeestreams;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PostaDiPaese {
	private String denominazione;
	private String indirizzoSede;
	private LocalDate dataApertura;
	private Integer numeroDipendenti;
	private List<Destinatario> destinatari = new ArrayList<>();
	
	
	
	public PostaDiPaese(String denominazione, String indirizzoSede, LocalDate dataApertura, Integer numeroDipendenti) {
		super();
		this.denominazione = denominazione;
		this.indirizzoSede = indirizzoSede;
		this.dataApertura = dataApertura;
		this.numeroDipendenti = numeroDipendenti;
		
	}



	public String getDenominazione() {
		return denominazione;
	}



	public void setDenominazione(String denominazione) {
		this.denominazione = denominazione;
	}



	public String getIndirizzoSede() {
		return indirizzoSede;
	}



	public void setIndirizzoSede(String indirizzoSede) {
		this.indirizzoSede = indirizzoSede;
	}



	public LocalDate getDataApertura() {
		return dataApertura;
	}



	public void setDataApertura(LocalDate dataApertura) {
		this.dataApertura = dataApertura;
	}



	public Integer getNumeroDipendenti() {
		return numeroDipendenti;
	}



	public void setNumeroDipendenti(Integer numeroDipendenti) {
		this.numeroDipendenti = numeroDipendenti;
	}



	public List<Destinatario> getDestinatari() {
		return destinatari;
	}



	public void setDestinatari(List<Destinatario> destinatari) {
		this.destinatari = destinatari;
	}



	
	
	
	
	
	
	
	
}
