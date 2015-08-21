package mmt.controller;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import mmt.data.entity.Shipment;
import mmt.data.entity.Warehouse;
import mmt.model.delegate.ShipmentDelegate;
import mmt.model.delegate.WarehouseDelegate;

@Controller 
@RequestMapping("/get/warehouses")
public class WarehouseRestController {
	
	 @Autowired
	  private WarehouseDelegate whDelegate;
	
	@RequestMapping(value="/all",method=RequestMethod.GET)
	public @ResponseBody String getWarehouses(){
		
		Iterable<Warehouse> warehouses= whDelegate.findAllWarehouses();
		String stringWarehouses="{\"warehouses\":[";
		
		int index= 0;
		for(Warehouse w: warehouses){
			if(index==0){
				stringWarehouses+=w.toString();
			}
			else{
				stringWarehouses+=","+w.toString();
			}
			index++;
		}
		stringWarehouses+="]}";
		//Collection<Warehouse> readValues = new ObjectMapper().readValue(jsonAsString,new TypeReference<Collection<Warehouse>>() { });

		
		return stringWarehouses;
		
		
	}

}
