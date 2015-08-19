package mmt.model.delegate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mmt.data.dao.ShipmentCrudRepo;
import mmt.data.dao.WarehouseCrudRepo;
import mmt.data.entity.Shipment;
import mmt.data.entity.Warehouse;

@Component
public class ShipmentDelegate {
	
	@Autowired
	private ShipmentCrudRepo shipmentCrud;
	@Autowired
	private WarehouseCrudRepo whCrud;
	
	
	public Shipment saveShipment(Shipment shipment,long warehouseid){
		Warehouse foundWh=whCrud.findOne(warehouseid);
		System.out.println("============>"+foundWh.getWarehouseName());
		foundWh.getShipments().add(shipment);
		whCrud.save(foundWh);
		return shipment;
	}
	
	public Iterable<Shipment> getAllShipment(){
		return shipmentCrud.findAll();
	}

}
