package controllers;

import java.util.List;

import models.Clinica;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.configurar_clinica;
import views.html.header;
import views.html.menu;

public class ClinicaController extends Controller {

	public static Result index() {
		List<Clinica> clinicas = Clinica.find.findList();
		System.out.println("Numero de clinicas: " + clinicas.size());
		return ok(configurar_clinica.render(menu.render(), header.render()));
	}

	public static Result createOrUpdate() {
		return TODO;
	}

}
