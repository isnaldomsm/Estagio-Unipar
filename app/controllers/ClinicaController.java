package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.configurar_clinica;
import views.html.header;
import views.html.menu;

public class ClinicaController extends Controller{

	public static Result index() {
		return ok(configurar_clinica.render(menu.render(), header.render()));
	}

	
}
