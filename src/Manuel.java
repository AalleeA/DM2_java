class Manuel extends livre{
  private int niveau;

  public void manuel(int nEnregistrement, String title, String auteur, int nPages, int niveau){
    super(nEnregistrement, title, auteur, nPages);
    this.niveau = niveau;
  }
  public int getNiveau(){
    return(this.niveau);
  }
  public void setNiveau(int niveau){
    this.niveau = niveau;
  }
}
