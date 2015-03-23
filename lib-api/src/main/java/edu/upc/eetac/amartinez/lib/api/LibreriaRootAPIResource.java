package edu.upc.eetac.amartinez.lib.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import edu.upc.eetac.amartrinez.libreria.api.modelo.LibROOTAPI;

@Path("/")
public class LibreriaRootAPIResource {
	@GET
	public LibreriaRootAPIResource getRootAPI() {
		edu.upc.eetac.amartinez.lib.api.modelo.LibROOTAPI api = new edu.upc.eetac.amartinez.lib.api.modelo.LibROOTAPI();
		return api;
	}
}