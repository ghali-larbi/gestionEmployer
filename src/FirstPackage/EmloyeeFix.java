package FirstPackage;

public class EmloyeeFix extends Personne{
	 
	public EmloyeeFix(String nom, int salaireMensuelle) {
		super();
		// TODO Auto-generated constructor stub
		this.nom = nom ;
		this.salaireMensuelle = salaireMensuelle ;
		 
	}

	public void setSalaireFix(int salaireFix) {
		this.salaireMensuelle = salaireFix;

	}	
	public double EmployeeComissiont() {
		return salaireMensuelle ;
	}
}
