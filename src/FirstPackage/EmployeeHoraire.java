package FirstPackage;

public class EmployeeHoraire  extends Personne{
	

	int heuresPrestés ;
    int tauxHauraire ;
    
    public int getTauxHauraire() {
		return tauxHauraire;
	}

	public void setTauxHauraire(int tauxHauraire) {
		this.tauxHauraire = tauxHauraire;
	}

	public int getHeuresPrestés() {
		return heuresPrestés;
	}

	public void setHeuresPrestés(int heuresPrestés) {
		this.heuresPrestés = heuresPrestés;
	}

	
	public double EmployeeComissiont() {
		return this.salaireMensuelle = tauxHauraire * heuresPrestés;
	}
	public EmployeeHoraire(String nom ,int heuresPrestés ,int tauxHauraire,int salaireMensuelle2) {
		super();
		// TODO Auto-generated constructor stub
		this.nom = nom ;
		this.heuresPrestés = heuresPrestés;
		this.tauxHauraire = tauxHauraire ;
	}
	
	// TODO Auto-generated method stub

	@Override
	public String toString() {
		return "EmployeeHoraire [tauxHauraire=" + tauxHauraire + ", heuresPrestés=" + heuresPrestés +  "]";
	}
	



}
