package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.header;
import views.html.listar_funcionarios;
import views.html.listar_medico;
import views.html.menu;

public class Application extends Controller {

	public static Result index() {
		return ok(listar_medico.render(menu.render(), header.render()));
	}

}
