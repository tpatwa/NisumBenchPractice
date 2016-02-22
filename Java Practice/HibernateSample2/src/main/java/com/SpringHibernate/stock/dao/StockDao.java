package com.SpringHibernate.stock.dao;


import com.SpringHibernate.stock.model.Stock;

public interface StockDao {
	
	void save(Stock stock);
	
	void update(Stock stock);
	
	void delete(Stock stock);
	
	void deleteByCode(String stockCode);
	
	Stock findByStockCode(String stockCode);

}
