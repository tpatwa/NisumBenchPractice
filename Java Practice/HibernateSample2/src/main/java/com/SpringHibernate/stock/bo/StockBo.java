package com.SpringHibernate.stock.bo;

import com.SpringHibernate.stock.model.Stock;

public interface StockBo {
	
	void save(Stock stock);
	
	void update(Stock stock);
	
	void delete(Stock stock);
	
	void deleteByCode(String stockCode);
	
	Stock findByStockCode(String stockCode);

}
