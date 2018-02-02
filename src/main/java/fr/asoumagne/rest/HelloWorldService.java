package fr.asoumagne.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/users")
public class HelloWorldService {
	
	@GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public User getUser( @PathParam("id") int id ) {
        User user = new User(id, "John Doe", 22);
        return user;
    }
	
	@GET
    @Path("/test/{name}")
    public int getMsg( @PathParam("name") int name ) {
		System.out.println(name);
        return name;
    }
	
	public class User{
		int id;
		String name;
		int age;
		
		public User(int id, String name, int age) {
			this.id = id;
			this.name = name;
			this.age = age;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
		
		
		
	}

}

//http://localhost:8080/TemplateRestApp/rest/hello/0 : Hello John
//http://localhost:8080/TemplateRestApp/rest/hello/1 : Hello Kevin
//http://localhost:8080/TemplateRestApp/rest/hello/2 : Hello Tom