package FirstPackage;

public class EmployeeComission extends Personne{

		
	int vent ;
	 int commisionF;


	public int EmployeeVent() {
		return vent;
	}
	public void EmployeeVent(int vent) {
		 this.vent = vent;
	}


	public int EmployeeCommisionF() {
		return commisionF;
	}
	
	public void EmployeeCommisionF(int commisionF) {
		this.commisionF = commisionF;
	}

	public  EmployeeComission(String nom ,int vent , int commisionF , int salaireMensuelle) {
		super();
		this.vent = vent;
		this.commisionF = commisionF ;
		this.salaireMensuelle = salaireMensuelle;
	}
	
	public double EmployeeComissiont() {
		return vent;
	}
	

	@Override
	public String toString() {
		return "EmployeeComission   vent=" + vent + ", commisionF=" + commisionF ;
	}
	

}
