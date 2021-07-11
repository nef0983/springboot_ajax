package com.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.query.StockRepository;
import com.main.table.StockTable;

@RestController
public class Controller {

	@Autowired
	StockRepository sr;

	@GetMapping("/findall")
	public String findall() {

		List<StockTable> list = sr.findAll();
		return list.toString();
	}

	@GetMapping("/show")
	public String show() {
		
		return"你是誰?";
	}
	
}
