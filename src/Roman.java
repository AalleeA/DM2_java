class Roman extends livre{
  private int prix;

  public roman(int nEnregistrement, String titre, String auteur, int nPages, int prix){
    super(nEnregistrement, titre, auteur, nPages);
    this.prix = prix;
  }
  public int getPrix(){
    return(this.prix);
  }
  public void setPrix(int prix){
    this.prix = prix;
  }
}
