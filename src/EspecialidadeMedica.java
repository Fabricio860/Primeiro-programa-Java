
public class EspecialidadeMedica {

	private String Codigo;
	private String Descricao;
	
	public EspecialidadeMedica(String codigo, String descricao) {
		super();
		Codigo = codigo;
		Descricao = descricao;
	}

	public String getCodigo() {
		return Codigo;
	}

	public void setCodigo(String codigo) {
		Codigo = codigo;
	}

	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
	}
	
public String toString () {
		
		return "C�digo da especialidade m�dica: "+ Codigo
				+";\nDescri��o da especialidade: "+ Descricao+";" ;
	
    }

	
	
}
