package mmt.data.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import mmt.data.entity.Inventory;

@Repository
public interface InventoryCrudRepo extends CrudRepository<Inventory, Long> {

}
