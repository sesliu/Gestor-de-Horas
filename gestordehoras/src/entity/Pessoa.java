package entity;


public class Pessoa {

	private String nome;
	private Integer codigo;
	private Integer matricula;
	private String login;
	private String senha;
	private Setor setor;
	private Funcao funcao;
	private Tipo tipo;
	
	
	public Pessoa() {
		
	}

	
	
	public Pessoa(String nome, Integer codigo, Integer matricula, String login, String senha, Setor setor,
			Funcao funcao, Tipo tipo) {
		super();
		this.nome = nome;
		this.codigo = codigo;
		this.matricula = matricula;
		this.login = login;
		this.senha = senha;
		this.setor = setor;
		this.funcao = funcao;
		this.tipo = tipo;
	}

	


	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", codigo=" + codigo + ", matricula=" + matricula + ", login=" + login
				+ ", senha=" + senha + "]";
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
	}

	public Funcao getFuncao() {
		return funcao;
	}

	public void setFuncao(Funcao funcao) {
		this.funcao = funcao;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	


	public String getLogin() {
		return login;
	}



	public void setLogin(String login) {
		this.login = login;
	}



	public String getSenha() {
		return senha;
	}



	public void setSenha(String senha) {
		this.senha = senha;
	}


	
	
	
	
}
