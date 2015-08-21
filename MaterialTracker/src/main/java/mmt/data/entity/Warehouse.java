package mmt.data.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
public class Warehouse {
	@Id
	private long warehouseId;
	
	@Column
	private String warehouseName;
	
	@OneToMany(fetch=FetchType.EAGER, cascade={CascadeType.ALL})
	private List<Shipment> shipments;

	

	public long getWarehouseId() {
		return warehouseId;
	}

	public void setWarehouseId(long warehouseId) {
		this.warehouseId = warehouseId;
	}

	public String getWarehouseName() {
		return warehouseName;
	}

	public void setWarehouseName(String warehouseName) {
		this.warehouseName = warehouseName;
	}

	public List<Shipment> getShipments() {
		return shipments;
	}

	public void setShipments(List<Shipment> shipments) {
		this.shipments = shipments;
	}

	@Override
	public String toString() {
		String result="{\"warehouseName\":\"" + warehouseName + "\", \"shipments\":[";
		Shipment s= new Shipment();
		
		for(int index=0; index< shipments.size(); index++){
			s=shipments.get(index);
			if(index==0){
				result+=s.toString();
			}
			else{
				result+=","+s.toString();
			}
		}
		result+="]}";
		System.out.println(result);
		return result;
	}
	
	
	

}