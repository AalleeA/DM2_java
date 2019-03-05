import java.util.*;

public class Bibliotheque{

  public static void main(String[] args){
    Bibliotheque bib = new Bibliotheque(20);
    Roman rom = new Roman(12, "L1", "Proust", 4, 1);

    bib.ajouter(rom);
    bib.afficherDocuments();
    System.out.println("\n");
    bib.afficherAuteur();
  }

  private int capacite;
  private List<Document> stock;

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
        System.out.println(doc.toString());
      }

    }
  }



}
