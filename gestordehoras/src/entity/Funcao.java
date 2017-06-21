package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="funcao")
public class Funcao {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idFuncao;
	@Column(length= 50, nullable = true)
	private String nome;
	@Enumerated(EnumType.STRING)
	@Column(columnDefinition = "enun('ATIVO','INATIVO')")
	private String ativo;
	
	public Funcao() {
	
	}

	public Funcao(Integer idFuncao, String nome, String ativo) {
		super();
		this.idFuncao = idFuncao;
		this.nome = nome;
		this.ativo = ativo;
	}

	@Override
	public String toString() {
		return "idFuncao [idFuncao=" + idFuncao + ", nome=" + nome + ", ativo=" + ativo + "]";
	}

	public Integer getIdFuncao() {
		return idFuncao;
	}

	public void setIdFuncao(Integer idFuncao) {
		this.idFuncao = idFuncao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAtivo() {
		return ativo;
	}

	public void setAtivo(String ativo) {
		this.ativo = ativo;
	}
	
	
	
}
