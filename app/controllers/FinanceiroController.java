package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.financeiro;
import views.html.funcionario;
import views.html.header;
import views.html.listar_financeiro;
import views.html.listar_funcionarios;
import views.html.menu;

public class FinanceiroController extends Controller{

	public static Result create() {
		return ok(financeiro.render(menu.render(), header.render()));
	}

	public static Result read() {
		return ok(listar_financeiro.render(menu.render(), header.render()));
	}

	
}
