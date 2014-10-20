package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.header;
import views.html.menu;
import views.html.paciente;

public class Application extends Controller {

	public static Result index() {
		return ok(paciente.render(menu.render(), header.render()));
	}

}
