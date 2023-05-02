package it.prova.listeestreams;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TestListeStreams {

	public static void main(String[] args) {

		List<PostaDiPaese> listaPoste = MockData.POSTADIPAESE_LIST;

		// poste il cui indirizzo contenga MI

		List<PostaDiPaese> resultContieneMIIndirizzo = listaPoste.stream()
				.filter(p -> p.getIndirizzoSede().contains("mi")).collect(Collectors.toList());
		System.out.println("poste in cui l'indirizzo contiene 'mi':");
		resultContieneMIIndirizzo.forEach(p -> System.out.println(p.getIndirizzoSede()));

//		 poste aperte dopo il primo marzo 2019:

		LocalDate dataDaUsare = LocalDate.parse("2019-03-01");
		List<PostaDiPaese> posteAperteDopoMarzo = listaPoste.stream()
				.filter(posta -> posta.getDataApertura().isAfter(dataDaUsare)).collect(Collectors.toList());
		System.out.println("poste aperte dopo il primo marzo 2019:");
		posteAperteDopoMarzo.forEach(posta -> System.out.println(posta.getDenominazione()));

		// la lista di indirizzi delle poste il cui numero dipendenti sia superiore a 20

		List<String> posteConDipendentiMaggiori = listaPoste.stream().filter(posta -> posta.getNumeroDipendenti() > 20)
				.map(posta -> posta.getIndirizzoSede()).collect(Collectors.toList());
		System.out.println("indirizzi poste con numero dipendenti superiore a 20");
		posteConDipendentiMaggiori.forEach(System.out::println);

//		 //la lista di indirizzi di destinatari di poste con almeno 10 dipendenti
//		 List<String> resultConDipendentiMaggioriDi10 = listaPoste.stream()
//		     .filter(p -> p.getNumeroDipendenti() >= 10)
//		     .flatMap(p -> p.getDestinatari().stream())
//		     .map( destinatario -> destinatario.)
//		     .collect(Collectors.toList());

		// la lista di destinatari possessori di conto corrente ma appartenenti a poste
		// con numero dipendenti compreso tra 50 e 100;
		List<Destinatario> destinatariConContoCorrenteEPosteConDipendentiTra50e100 = listaPoste.stream()
				.filter(posta -> posta.getNumeroDipendenti() >= 50 && posta.getNumeroDipendenti() <= 100)
				.flatMap(posta -> ((List<Destinatario>) posta.getDestinatari()).stream())
				.filter(destinatario -> destinatario.isPossessoreDiContoCorrente()).collect(Collectors.toList());
		System.out.println("I destinatari che hanno un conto e appartenenti a uffici postali con numero dipendenti compreso tra 50 e 100 sono: ");
		destinatariConContoCorrenteEPosteConDipendentiTra50e100.forEach(destinatario -> System.out.println(destinatario.getNome()+ " " + destinatario.getCognome()));
		
		
		
		// la lista delle età dei destinatari delle poste che contengano nel campo
		// denominazione la stringa ‘Centrale’
		// e siano state aperta almeno dal primo gennaio 2000.

		List<Integer> etaDestinatariPosteCentraleAperteDopo2000 = listaPoste.stream()
				.filter(p -> p.getDenominazione().contains("Centrale"))
				.filter(p -> p.getDataApertura().isAfter(LocalDate.parse("2000-01-01")))
				.flatMap(p -> ((List<Destinatario>) p.getDestinatari()).stream())
				.map(destinatario -> destinatario.getEta()).collect(Collectors.toList());
		System.out.println("Ecco la lista delle età dei destinatari");
		etaDestinatariPosteCentraleAperteDopo2000.forEach(System.out::println);
		
	}

}
