package mmt.controller;

import javax.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mmt.data.entity.Shipment;
import mmt.data.entity.Warehouse;
import mmt.model.delegate.ShipmentDelegate;
import mmt.model.delegate.WarehouseDelegate;

@Controller
@RequestMapping("/shipments")
public class ShipmentController {
	@Autowired
	private ShipmentDelegate shipmentDelegate;
	@Autowired
	private WarehouseDelegate whDelegate;
	
	@RequestMapping(value="/display",method=RequestMethod.GET)
	public String getWarehouses(Model model) {
		return "ajaxtest";
	}
	
	@RequestMapping(value="/request", method=RequestMethod.GET)
	public String getShipmentForm(Model model){
		
		model.addAttribute("shipment", new Shipment());
		model.addAttribute("warehouses",whDelegate.findAllWarehouses());
		model.addAttribute("chosenWarehouse", new Warehouse());
		return "shipmentForm";
	}

	@RequestMapping(value="/submit", method=RequestMethod.POST)
	public String submit( Shipment shipment, Warehouse chosenWarehouse, Model model){
		
		Shipment addedShipment=shipmentDelegate.saveShipment(shipment,chosenWarehouse.getWarehouseId());
		model.addAttribute("addedShipments",addedShipment);
		model.addAttribute("warehouses",whDelegate.findAllWarehouses());
		return "addedShipments";
	}
}
