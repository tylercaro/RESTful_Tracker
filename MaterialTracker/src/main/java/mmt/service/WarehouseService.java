package mmt.service;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;

import mmt.data.entity.Warehouse;
import mmt.data.entity.Shipment;

import mmt.model.delegate.*;

@Service
@Singleton
@Path("/warehouse")
public class WarehouseService {
	
	 @Autowired
	  private WarehouseDelegate whDelegate;
	  
	  @GET
	  @Path("/all")
	  @Produces(MediaType.TEXT_PLAIN_VALUE)
	  public Response getAllWarehouses(){
		  StringBuilder report= new StringBuilder();
		  Iterable<Warehouse> warehouses= whDelegate.findAllWarehouses();
		  
		  for(Warehouse w : warehouses){
			  report.append(w.toString()+"\n");
		  }
		  return Response.ok(report.toString()).build();
	    
	  }

}
