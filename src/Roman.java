class Roman extends livre{
  private int prix; // 1:GONGOURT			2:MEDICIS			3:INTERALLIE

  public roman(int nEnregistrement, String titre, String auteur, int nPages, int prix){
    super(nEnregistrement, titre, auteur, nPages);
    this.prix = prix;
  }
  
  public String toString(){
	siwtch (this.prix){
		case 1:
			return super.toString() + "Prix : GONCOURT";
			break;
		case 2:
			return super.toString() + "Prix : MEDICIS";
			break;
		case 3:
			return super.toString() + "Prix : INTERALLIE";
			break;
		default:
			return super.toString() + "Pas de prix";
			break;
	}
  }
  
  public int getPrix(){
    return(this.prix);
  }
  
  public void setPrix(int prix){
    this.prix = prix;
  }
}
