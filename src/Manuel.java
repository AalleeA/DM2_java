class Manuel extends livre{
  private int niveau;

  public manuel(int nEnregistrement, String title, String auteur, int nPages, int niveau){
    super(nEnregistrement, title, auteur, nPages);
    this.niveau = niveau;
  }

  public String toString(){
	return  super.toString() + "Niveau : " + niveau + " ";
  }

  public int getNiveau(){
    return(this.niveau);
  }

  public void setNiveau(int niveau){
    this.niveau = niveau;
  }
}
