
public class Funcionario {
	
	private String Registro;
	private String Funcao;
	private String Salario;
	
	public Funcionario(String registro, String funcao, String salario) {
		super();
		Registro = registro;
		Funcao = funcao;
		Salario = salario;
	}
	public String getRegistro() {
		return Registro;
	}
	public void setRegistro(String registro) {
		Registro = registro;
	}
	public String getFuncao() {
		return Funcao;
	}
	public void setFuncao(String funcao) {
		Funcao = funcao;
	}
	public String getSalario() {
		return Salario;
	}
	public void setSalario(String salario) {
		Salario = salario;
	}
	
public String toString () {
		
		return "Registro do funcionário: "+ Registro
				+"\nFunção do funcionário: "+ Funcao
				+"\nSalario R$ "+ Salario ;
}

}
