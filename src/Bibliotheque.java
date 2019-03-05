import java.util.*;

public class Bibliotheque{

  public static void main(String[] args){
    Bibliotheque bib = new Bibliotheque(20);
    Roman rom = new Roman(12, "ROM1", "Proust", 4, 1);
	Roman rom1 = new Roman(13, "ROM2", "Pagnol", 5,2);
	
	Manuel man1 = new Manuel(10, "MAN1", "HACHETTE",20, 1);
	Manuel man2 = new Manuel(11, "MAN2", "HACHETTE",13, 2);
	
	Revue rev1 = new Revue(5, "GORAFI", 2019, 1);
	Revue rev2 = new Revue(6, "GORAFI", 2019, 2);
	
	List<Document> doclist = new ArrayList<Document>();

    bib.ajouter(rom);
	bib.ajouter(rom1);
	
	doclist.add(man1);
	doclist.add(man2);
	doclist.add(rev1);
	doclist.add(rev2);
	
	System.out.println("\n\nNous avons ajoute ROM1 et ROM2 a la bibliotheque et nous utilisons afficher document");
    bib.afficherDocuments();
	System.out.println("\n\n\nNous creons la liste de document doclist avec 2 manuels et 2 revues \nnous l'ajoutons a l'aide de la fonction ajouter livre \n et nous utilions afficher document");
	bib.ajouterLivre(doclist);
	bib.afficherDocuments();
	System.out.println("Il est normal que les revues ne soient pas affichés car ajouterLivre n'ajoute que les livres\n\n\n");
	System.out.println("nous creons une livrotheque");
	Livrotheque liv = new Livrotheque(30);
	liv.ajouterListe(doclist);
	System.out.println("On ajoute la liste de document precedente et affichons les documents puis les auteurs");
	liv.afficherDocuments();
	liv.afficherAuteur();
	System.out.println("Encore une fois il est normal que les revues ne s'affichent pas car on affiche une livrotheque\n\n\n");
    System.out.println("Nous ajoutons les deux revues a la bibliotheque et affichons les documents et les auteurs\n");
	bib.ajouter(rev1);
	bib.ajouter(rev2);
	bib.afficherDocuments();
    bib.afficherAuteur();
  }

  public int capacite;
  public List<Document> stock;

  public Bibliotheque(int capacite){
    this.capacite = capacite;
    this.stock = new ArrayList<Document>();
  }
  public boolean ajouter(Document doc){
    boolean ret = false;
    if(stock.size() < capacite){
      stock.add(doc);
      ret = true;
    }
    return(ret);
  }

  public void afficherDocuments(){
    for(Document doc:stock){
      System.out.println(doc.getNenregistrement() + " " + doc.getTitle());
    }
  }

  public void afficherAuteur(){
    for(Document doc:stock){
      if(doc instanceof Livre){
        System.out.println(((Livre)doc).getAuteur());
      }

    }
  }

  public void ajouterLivre(List<Document> doclist){
    for(Document doc:doclist){
      if(doc instanceof Livre){
        this.ajouter(doc);
      }
    }
  }



}
