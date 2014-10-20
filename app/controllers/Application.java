package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.header;
import views.html.listar_medico;
import views.html.listar_paciente;
import views.html.listar_planos;
import views.html.menu;

public class Application extends Controller {

	public static Result index() {
		return ok(listar_planos.render(menu.render(), header.render()));
	}

}
