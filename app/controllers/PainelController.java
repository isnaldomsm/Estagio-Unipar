package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.header;
import views.html.home;
import views.html.menu;

public class PainelController extends Controller{

	public static Result index() {
		
		return ok(home.render(menu.render(), header.render()));
	}

	
}
