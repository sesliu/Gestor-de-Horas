package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="setor")
public class Setor {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idSetor;
	@Column(length=50, nullable=false)
	private String nome;
	@Enumerated
	@Column(columnDefinition="enun('ATIVO','INATIVO')")
	private String ativo;
	@OneToMany
	@JoinTable(name="empresa")
	private Empresa empresa;
	
	
	public Setor() {

	}


	public Setor(Integer idSetor, String nome, String ativo, Empresa empresa) {
		super();
		this.idSetor = idSetor;
		this.nome = nome;
		this.ativo = ativo;
		this.empresa = empresa;
	}


	@Override
	public String toString() {
		return "Setor [idSetor=" + idSetor + ", nome=" + nome + ", ativo=" + ativo + "]";
	}


	public Integer getIdSetor() {
		return idSetor;
	}


	public void setIdSetor(Integer idSetor) {
		this.idSetor = idSetor;
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


	public Empresa getEmpresa() {
		return empresa;
	}


	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	
	
	
	
	
	
}
