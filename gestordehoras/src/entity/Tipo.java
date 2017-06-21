package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tipo")
public class Tipo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idTipo;
	@Column(length= 50 , nullable = false)
	private String nome;
	
	
	public Tipo() {
		// TODO Auto-generated constructor stub
	}


	public Tipo(Integer idTipo, String nome) {
		super();
		this.idTipo = idTipo;
		this.nome = nome;
	}


	@Override
	public String toString() {
		return "Tipo [idTipo=" + idTipo + ", nome=" + nome + "]";
	}


	public Integer getIdTipo() {
		return idTipo;
	}


	public void setIdTipo(Integer idTipo) {
		this.idTipo = idTipo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
