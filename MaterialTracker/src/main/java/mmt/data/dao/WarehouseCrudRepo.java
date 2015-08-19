package mmt.data.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import mmt.data.entity.Warehouse;

@Repository
public interface WarehouseCrudRepo extends CrudRepository<Warehouse,Long>{
	@Query("FROM Warehouse WHERE warehouseName = :name")
	public Warehouse findWarehouseByName(@Param("name") String name);
	
	

}
