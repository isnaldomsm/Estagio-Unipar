package controllers;

import java.util.List;

import models.Teste;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.configurar_clinica;
import views.html.header;
import views.html.menu;

public class ClinicaController extends Controller {

	private static final Form<Teste> clinicaForm = Form.form(Teste.class);

	public static Result index() {
		List<Teste> clinicas = Teste.find.findList();
		System.out.println("Numero de clinicas: " + clinicas.size());
		return ok(configurar_clinica.render(menu.render(), header.render(), clinicaForm));
	}

	public static Result gravar() {
		Form<Teste> form = Form.form(Teste.class).bindFromRequest(); 
		Teste c = form.get();
		c.save();
		return TODO;
	}

}
