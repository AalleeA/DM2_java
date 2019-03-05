class Document{

  private int nEnregistrement;
  private String titre;

  public Document(int Numero,String title){
    this.nEnregistrement = Numero;
    this.titre = title;
  }

  public int getNenregistrement(){
    return(this.nEnregistrement);
  }
  public String getTitle(){
    return(this.titre);
  }
  public void setNenregistrement(int numero){
    this.nEnregistrement = numero;
  }
  public void setTitle(String title){
    this.titre = title;
  }
}
