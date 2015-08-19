package mmt.data.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import mmt.data.entity.Shipment;

@Repository
public interface ShipmentCrudRepo extends CrudRepository<Shipment,Long>{

}
