
public class PessoaFisica {

	private String CPF;
	private String RG;
	private String Nome;
	private char Sexo;
	private String Dt;
	private String Endereco;
	private String Tel;
	
	public PessoaFisica(String cPF, String rG, String nome, char sexo, String dt, String endereco, String tel) {
		super();
		CPF = cPF;
		RG = rG;
		Nome = nome;
		Sexo = sexo;
		Dt = dt;
		Endereco = endereco;
		Tel = tel;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getRG() {
		return RG;
	}

	public void setRG(String rG) {
		RG = rG;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public char getSexo() {
		return Sexo;
	}

	public void setSexo(char sexo) {
		Sexo = sexo;
	}

	public String getDt() {
		return Dt;
	}

	public void setDt(String dt) {
		Dt = dt;
	}

	public String getEndereco() {
		return Endereco;
	}

	public void setEndereco(String endereco) {
		Endereco = endereco;
	}

	public String getTel() {
		return Tel;
	}

	public void setTel(String tel) {
		Tel = tel;
	}
	
public String toString () {
		
		return " Nome do paciente: " + Nome 
				+ "\nCPF: "+ CPF
				+"\nRG: "+ RG
				+"\nSexo : "+ Sexo
				+"\nData de Nascimento: "+ Dt
				+"\nEndereço: " + Endereco
				+"\nTel: "+ Tel		
				;
				
				
				
}


	
}
