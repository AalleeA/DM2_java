public class Revue extends Document{
  private int annee;
  private int mois;

  public void revue(int nEnregistrement, String titre ,int annee, int mois){
    super(nEnregistrement, titre);
    this.annee = annee;
    this.mois = mois;
  }
  public int getAnnee(){
    return(this.annee);
  }
  public int getMois(){
    return(this.mois);
  }
  public void setAnnee(int annee){
    this.annee = annee;
  }
  public void setMois(int mois){
    this.mois = mois;
  }
}
