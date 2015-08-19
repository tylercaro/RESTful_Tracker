package mmt.data.entity;

import javax.persistence.*;

@Entity
public class Shipment {
	
	@Id
	@GeneratedValue(generator="seq_shipid", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="seq_shipid",sequenceName="seq_shipid")
	private long shipmentId;
	
	@Column
	private String itemType;
	private String itemDescription;
	private int itemCount;
	private String destination;
	
	@ManyToOne(fetch=FetchType.EAGER)
	private Warehouse warehouse;



	public long getShipmentId() {
		return shipmentId;
	}

	public void setShipmentId(long shipmentId) {
		this.shipmentId = shipmentId;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public int getItemCount() {
		return itemCount;
	}

	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Warehouse getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(Warehouse warehouse) {
		this.warehouse = warehouse;
	}

}
