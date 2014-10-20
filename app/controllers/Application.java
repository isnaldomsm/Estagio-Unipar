package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.header;
import views.html.medico;
import views.html.menu;

public class Application extends Controller {

	public static Result index() {
		return ok(medico.render(menu.render(), header.render()));
	}

}
