package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.header;
import views.html.listar_planos;
import views.html.menu;
import views.html.planos;

public class PlanoSaudeController extends Controller{

	public static Result create() {
		return ok(planos.render(menu.render(), header.render()));
	}

	public static Result read() {
		return ok(listar_planos.render(menu.render(), header.render()));
	}

	
}
