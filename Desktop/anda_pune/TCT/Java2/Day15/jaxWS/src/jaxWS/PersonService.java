package jaxWS;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

//Now we will have to create an interface where we will declare 
//the methods we will expose in our JAX-WS example web services.

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface PersonService {

	@WebMethod
	public boolean addPerson(Person p);
	
	@WebMethod
	public boolean deletePerson(int id);
	
	@WebMethod
	public Person getPerson(int id);
	
	@WebMethod
	public Person[] getAllPersons();
}

