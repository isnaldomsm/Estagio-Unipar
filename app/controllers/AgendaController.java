package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.agenda;
import views.html.agendamento;
import views.html.header;
import views.html.menu;

public class AgendaController extends Controller{

	public static Result create() {
		return ok(agenda.render(menu.render(), header.render()));
	}

	public static Result read() {
		return ok(agendamento.render(menu.render(), header.render()));
	}

	
}
