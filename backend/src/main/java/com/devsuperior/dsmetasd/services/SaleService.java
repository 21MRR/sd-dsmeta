package com.devsuperior.dsmetasd.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dsmetasd.entities.Sale;
import com.devsuperior.dsmetasd.repositories.SaleRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository saleRepository;
	
	public List<Sale> findSale(){
		
		return saleRepository.findAll();
		
	}

}
