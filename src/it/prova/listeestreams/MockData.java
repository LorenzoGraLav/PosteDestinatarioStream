package it.prova.listeestreams;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MockData {
	public static final List<PostaDiPaese> POSTADIPAESE_LIST = new ArrayList<>();

	static {

		LocalDate dataOpen = LocalDate.parse("2023-04-12");
		LocalDate dataOpen1 = LocalDate.parse("2023-04-18");
		LocalDate dataOpen2 = LocalDate.parse("2023-04-19");
		LocalDate dataOpen3 = LocalDate.parse("2023-04-20");

		PostaDiPaese postaDiOrte = new PostaDiPaese("Centrale", "via dei gigli 86", dataOpen, 50);
		Destinatario marco = new Destinatario("Marco", "Rossi", 39, "via delle rose 54", true, postaDiOrte);
		postaDiOrte.getDestinatari().add(marco);
		Destinatario luca = new Destinatario("Luca", "Morosi", 26, "via delle acacie 78", true, postaDiOrte);
		postaDiOrte.getDestinatari().add(luca);

		PostaDiPaese postaDiOrvieto = new PostaDiPaese("PostaUmbra", "via della mirata 98", dataOpen1, 68);
		Destinatario paolo = new Destinatario("Paolo", "Verdi", 24, "via ombrosi 36", true, postaDiOrvieto);
		postaDiOrvieto.getDestinatari().add(paolo);
		Destinatario anna = new Destinatario("Anna", "Premesca", 28, "via degli scacchi", true, postaDiOrvieto);
		postaDiOrvieto.getDestinatari().add(anna);

		PostaDiPaese postaViterbese = new PostaDiPaese("PostaTuscia", "via dei lupi 76", dataOpen2, 45);
		Destinatario carlo = new Destinatario("Carlo", "Ombrini", 29, "via mauro toffanini 23", true, postaViterbese);
		postaViterbese.getDestinatari().add(carlo);
		Destinatario chiara = new Destinatario("Chiara", "Grilli", 36, "via delle primule 56", true, postaViterbese);
		postaViterbese.getDestinatari().add(chiara);

		PostaDiPaese postaDiSpoleto = new PostaDiPaese("PostaFortezza", "via delle alabarde 48", dataOpen3, 75);
		Destinatario filippo = new Destinatario("Filippo", "Mancetti", 68, "via delle piccionaie 34", true,
				postaDiSpoleto);
		postaDiSpoleto.getDestinatari().add(filippo);
		Destinatario mauro = new Destinatario("Mauro", "Carletti", 54, "via delle spade 79", true, postaDiSpoleto);
		postaDiSpoleto.getDestinatari().add(mauro);
		Destinatario diana = new Destinatario("Diana", "Del Bufalone", 32, "via dell uva 25", false, postaDiSpoleto);
		postaDiSpoleto.getDestinatari().add(diana);

		POSTADIPAESE_LIST.add(postaDiOrte);
		POSTADIPAESE_LIST.add(postaDiOrvieto);
		POSTADIPAESE_LIST.add(postaViterbese);
		POSTADIPAESE_LIST.add(postaDiSpoleto);

	}

}
