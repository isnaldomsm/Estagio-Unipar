package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.header;
import views.html.listar_medico;
import views.html.medico;
import views.html.menu;

public class MedicoController extends Controller{

	public static Result create() {
		return ok(medico.render(menu.render(), header.render()));
	}

	public static Result read() {
		return ok(listar_medico.render(menu.render(), header.render()));
	}

	
}
