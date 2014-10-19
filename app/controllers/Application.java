package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.financeiro;
import views.html.header;
import views.html.menu;

public class Application extends Controller {
 
    public static Result index() {
		return ok(financeiro.render(menu.render(), header.render()));
	}

}
