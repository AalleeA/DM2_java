class Roman extends Livre{
  private int prix; // 1:GONGOURT			2:MEDICIS			3:INTERALLIE

  public Roman(int nEnregistrement, String titre, String auteur, int nPages, int prix){
    super(nEnregistrement, titre, auteur, nPages);
    this.prix = prix;
  }

  public String toString(){
	   switch (this.prix){
		     case 1:
			      return (super.toString() + "Prix : GONCOURT ");

		     case 2:
			      return (super.toString() + "Prix : MEDICIS ");

		     case 3:
			      return (super.toString() + "Prix : INTERALLIE ");

		     default:
			      return (super.toString() + "Pas de prix ");

	}
  }

  public int getPrix(){
    return(this.prix);
  }

  public void setPrix(int prix){
    this.prix = prix;
  }
}
