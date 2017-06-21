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
@Table(name="cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idCodigo;
	@Column (length=50)
	private String nome;
	@Column(columnDefinition = "enum('ATIVO','INATIVO')")
	@Enumerated(EnumType.STRING)
	private String ativo;
	
	public Cliente() {

	}

	public Cliente(Integer idCodigo, String nome, String ativo) {
		super();
		this.idCodigo = idCodigo;
		this.nome = nome;
		this.ativo = ativo;
	}

	@Override
	public String toString() {
		return "Assessoria [idCodigo=" + idCodigo + ", nome=" + nome + ", ativo=" + ativo + "]";
	}

	public Integer getIdCodigo() {
		return idCodigo;
	}

	public void setIdCodigo(Integer idCodigo) {
		this.idCodigo = idCodigo;
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
