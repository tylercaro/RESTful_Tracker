package mmt.model.delegate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mmt.data.dao.WarehouseCrudRepo;
import mmt.data.entity.Shipment;
import mmt.data.entity.Warehouse;

@Component
public class WarehouseDelegate {
	
	@Autowired
	private WarehouseCrudRepo whCrud;
	
	public Warehouse findWarehouse(String warehouse){
		return whCrud.findWarehouseByName(warehouse);
	}
	
	public Iterable<Warehouse> findAllWarehouses(){
		return whCrud.findAll();
	}
	
	/*public Iterable<Shipment> findWarehouseShipments(Long whId){
		whCrud.
	}*/

}
