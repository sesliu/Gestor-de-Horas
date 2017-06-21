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
@Table(name="empresa")
public class Empresa {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idEmpresa;
	@Column(length= 50)
	private String nome;
	@Column(length=10, nullable=false )
	private String expediente;
	@Column(length=10, nullable=false )
	private String horaAlmoco;
	@Column(length=10, nullable=false )
	private String horaEntrada;
	@Column(length=10, nullable=false )
	private String horaSaida;
	@Column(columnDefinition="enun('ATIVO', 'INATIVO')")
	@Enumerated(EnumType.STRING)
	private String ativo;
	
	
	public Empresa() {
	
	}

	

	public Empresa(Integer idEmpresa, String nome, String expediente, String horaAlmoco, String horaEntrada,
			String horaSaida, String ativo) {
		super();
		this.idEmpresa = idEmpresa;
		this.nome = nome;
		this.expediente = expediente;
		this.horaAlmoco = horaAlmoco;
		this.horaEntrada = horaEntrada;
		this.horaSaida = horaSaida;
		this.ativo = ativo;
	}



	@Override
	public String toString() {
		return "idEmpresa=" + idEmpresa + ", nome=" + nome + ", expediente=" + expediente + ", horaAlmoco="
				+ horaAlmoco + ", horaEntrada=" + horaEntrada + ", horaSaida=" + horaSaida + ", ativo=" + ativo + "]";
	}



	public Integer getIdEmpresa() {
		return idEmpresa;
	}



	public void setIdEmpresa(Integer idEmpresa) {
		this.idEmpresa = idEmpresa;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getExpediente() {
		return expediente;
	}



	public void setExpediente(String expediente) {
		this.expediente = expediente;
	}



	public String getHoraAlmoco() {
		return horaAlmoco;
	}



	public void setHoraAlmoco(String horaAlmoco) {
		this.horaAlmoco = horaAlmoco;
	}



	public String getHoraEntrada() {
		return horaEntrada;
	}



	public void setHoraEntrada(String horaEntrada) {
		this.horaEntrada = horaEntrada;
	}



	public String getHoraSaida() {
		return horaSaida;
	}



	public void setHoraSaida(String horaSaida) {
		this.horaSaida = horaSaida;
	}



	public String getAtivo() {
		return ativo;
	}



	public void setAtivo(String ativo) {
		this.ativo = ativo;
	}
	
	
	
	
}
