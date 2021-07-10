package com.main.query;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.table.StockTable;


@Repository
public interface StockRepository extends JpaRepository<StockTable, Long> {

	
	
}
