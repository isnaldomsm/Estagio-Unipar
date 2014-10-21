package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import play.data.validation.Constraints;
import play.db.ebean.Model;

@Entity
public class Teste extends Model {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;

	@Constraints.Required
	public String nome;

	public static Model.Finder<Long, Teste> find = new Model.Finder<Long, Teste>(Long.class, Teste.class);

	@Override
	public String toString() {
		return nome;
	}

}