
public class Medicos {
	
	private String CRM;
	private String CRM_UF;
	private String Especialidade;
	
	public Medicos(String cRM, String cRM_UF, String especialidade) {
		super();
		CRM = cRM;
		CRM_UF = cRM_UF;
		Especialidade = especialidade;
	}

	public String getCRM() {
		return CRM;
	}

	public void setCRM(String cRM) {
		CRM = cRM;
	}

	public String getCRM_UF() {
		return CRM_UF;
	}

	public void setCRM_UF(String cRM_UF) {
		CRM_UF = cRM_UF;
	}

	public String getEspecialidade() {
		return Especialidade;
	}

	public void setEspecialidade(String especialidade) {
		Especialidade = especialidade;
	}
	
public String toString () {
		
		return "CRM: "+ CRM
				+"\nCRM_UF"+ CRM_UF
				+"\nEspecialidade: "+ Especialidade ;
}
}
