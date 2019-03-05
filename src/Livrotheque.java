import java.util.*;

class Livrotheque extends Bibliotheque{

  public Livrotheque(int capa){
    super(capa);
  }

  public boolean ajouter(Document doc){
    boolean ret = false;
    if(stock.size() < capacite && doc instanceof Livre){
      stock.add(doc);
      ret = true;
    }
    return(ret);
  }


  public void afficherAuteur(){
    for(Document doc:stock){
        System.out.println(((Livre)doc).getAuteur());
    }
  }
}
