
public class Main {

	public static void main(String args[])
	{
		Telecommande t=new Telecommande();
		
		
		Lampe l1=new Lampe("Lampe1");
		t.ajouterAppareil(l1);
		Hifi h1=new Hifi();
		t.ajouterAppareil(h1);
		ChemineeAdapter ca = new ChemineeAdapter(new Cheminee());
		t.ajouterAppareil(ca);
		Lampe l2=new Lampe("Lampe2");
		t.ajouterAppareil(l2);
		t.ajouterAppareil(new Lampe("Lampe3"));

		
		TelecommandeGraphique tg=new TelecommandeGraphique(t);
		

		
	}
	
}
