package entity;

import java.util.Date;

public class Ticket {

	private Integer codigo;
	private String  numeroTicket;
	private String  assunto;
	private Date    hora;
	private Date    data;
	private String 	motivo;
	private String 	autoriza;
	private String 	observacao;
	private Date 	dataInicio;
	private Date	 dataFim;
	private Cliente cliente;
	private Pessoa pessoa;
	
	
	public Ticket() {

	}


	public Ticket(Integer codigo, String numeroTicket, String assunto, Date hora, Date data, String motivo,
			String autoriza, String observacao, Date dataInicio, Date dataFim, Cliente assessoria, Pessoa pessoa) {
		super();
		this.codigo = codigo;
		this.numeroTicket = numeroTicket;
		this.assunto = assunto;
		this.hora = hora;
		this.data = data;
		this.motivo = motivo;
		this.autoriza = autoriza;
		this.observacao = observacao;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.cliente = assessoria;
		this.pessoa = pessoa;
	}


	@Override
	public String toString() {
		return "Ticket [codigo=" + codigo + ", numeroTicket=" + numeroTicket + ", assunto=" + assunto + ", hora=" + hora
				+ ", data=" + data + ", motivo=" + motivo + ", autoriza=" + autoriza + ", observacao=" + observacao
				+ ", DataInicio=" + dataInicio + ", DataFim=" + dataFim + "]";
	}


	public Integer getCodigo() {
		return codigo;
	}


	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}


	public String getNumeroTicket() {
		return numeroTicket;
	}


	public void setNumeroTicket(String numeroTicket) {
		this.numeroTicket = numeroTicket;
	}


	public String getAssunto() {
		return assunto;
	}


	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}


	public Date getHora() {
		return hora;
	}


	public void setHora(Date hora) {
		this.hora = hora;
	}


	public Date getData() {
		return data;
	}


	public void setData(Date data) {
		this.data = data;
	}


	public String getMotivo() {
		return motivo;
	}


	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}


	public String getAutoriza() {
		return autoriza;
	}


	public void setAutoriza(String autoriza) {
		this.autoriza = autoriza;
	}


	public String getObservacao() {
		return observacao;
	}


	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}


	public Date getDataInicio() {
		return dataInicio;
	}


	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}


	public Date getDataFim() {
		return dataFim;
	}


	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public Pessoa getPessoa() {
		return pessoa;
	}


	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	
	
	
	
	
}
