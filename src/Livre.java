class Livre extends Document{
  public String auteur;
  public int nPages;

  public void Livre(int nEnregistrement, String titre, String auteur, int nPages){
    super(nEnregistrement, titre);
    this.auteur = auteur;
    this.nPages = nPages;
  }
  
  public String toString(){
	return super.toString() + auteur + "Nb de pages : " + nPages;
  }

  public String getAuteur(){
    return(this.auteur);
  }
  public int getNPages(){
    return(this.nPages);
  }
  public void setAuteur(String auteur){
    this.auteur = auteur;
  }
  public void setNPages(int nPages){
    this.nPages = nPages;
  }
}
