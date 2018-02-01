package fr.asoumagne.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloWorldService {
	
	String[] datas = new String[]{"John", "Kevin", "Tom"};

	@GET
	@Path("/{num}")
	public Response getMsg(@PathParam("num") int num) {
		//Error
		if(num >= datas.length || num < 0){
			return Response.status(404).build();
		}
		
		//Done
		String output = "Hello " + datas[num];
		return Response.status(200).entity(output).build();

	}

}

//http://localhost:8080/TemplateRestApp/rest/hello/0 : Hello John
//http://localhost:8080/TemplateRestApp/rest/hello/1 : Hello Kevin
//http://localhost:8080/TemplateRestApp/rest/hello/2 : Hello Tom