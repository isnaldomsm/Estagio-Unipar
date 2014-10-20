package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.funcionario;
import views.html.header;
import views.html.listar_funcionarios;
import views.html.menu;

public class FuncionarioController extends Controller{

	public static Result create() {
		return ok(funcionario.render(menu.render(), header.render()));
	}

	public static Result read() {
		return ok(listar_funcionarios.render(menu.render(), header.render()));
	}

	
}
