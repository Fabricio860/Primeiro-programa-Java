
public class Convenios {
	
	private String CNPJ;
	private String EmpresaConveniada;
	private String Telefone;
	private String Desconto;
	
	public Convenios(String cNPJ, String empresaConveniada, String telefone, String desconto) {
		super();
		CNPJ = cNPJ;
		EmpresaConveniada = empresaConveniada;
		Telefone = telefone;
		Desconto = desconto;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public String getEmpresaConveniada() {
		return EmpresaConveniada;
	}

	public void setEmpresaConveniada(String empresaConveniada) {
		EmpresaConveniada = empresaConveniada;
	}

	public String getTelefone() {
		return Telefone;
	}

	public void setTelefone(String telefone) {
		Telefone = telefone;
	}

	public String getDesconto() {
		return Desconto;
	}

	public void setDesconto(String desconto) {
		Desconto = desconto;
	}
	
	public String toString () {
		
		return "CNPJ: "+ CNPJ
				+"\nEmpresa convêniada: "+ EmpresaConveniada
				+"\nTel: "+ Telefone
				+"\nDesconto: "+Desconto ;
		
	}

}
