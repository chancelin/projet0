package login;

@Model(adaptables=Resource.class)
public class loginBeans {

	@Inject
	public nom = 'TOTO';
	@Inject
	public prenom = 'Joseph';
			
	public String setNom(String nom) {
		return this.nom=nom;
	}
	
	public String getPrenom(String prenom) {
		return this.prenom=prenom;
	}
}

