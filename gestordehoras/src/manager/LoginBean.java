package manager;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;


import entity.Pessoa;

@ManagedBean(name = "lb")
@SessionScoped
public class LoginBean {

	private Pessoa pessoa;

	private Pessoa logado;

	private HttpSession session = null;

	public LoginBean() {

		pessoa = new Pessoa();
		logado = new Pessoa();
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Pessoa getLogado() {
		return logado;
	}

	public void setLogado(Pessoa logado) {
		this.logado = logado;
	}

	public String autenticar() {

		FacesContext faces = FacesContext.getCurrentInstance();

		if (pessoa.getLogin().equalsIgnoreCase("admin") && pessoa.getSenha().equals("123")) {

			logado.setLogin("admin");

			if (logado != null) {
				faces.addMessage(null, new FacesMessage("Bem vindo ao sistema " + pessoa.getNome()));

				session = (HttpSession) faces.getExternalContext().getSession(true);
				session.setAttribute("logado", logado);

				return "admin/" + "painelControle.jsf?faces-redirect";

			}

		}

		else {

			faces.addMessage(null, new FacesMessage("Não logado"));
			session = null;
			pessoa = new Pessoa();

		}

		return null;
	}

	public String logout() {

	
		
		return "login.jsf?faces-redirect";
	}

}
