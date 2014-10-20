package models;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.data.validation.Constraints;
import play.db.ebean.Model;

@Entity
public class Clinica extends Model {

	private static final long serialVersionUID = -7258390397160266610L;
	@Id
	private Long id;
	@Constraints.Required
	private String nome;

	public static Model.Finder<Long, Clinica> find = new Model.Finder<Long, Clinica>(Long.class, Clinica.class);

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return getNome();
	}
}
