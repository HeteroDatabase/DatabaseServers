package com.heteroDB.MysqlServer.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MysqlQueryExecutionController {
	
	@RequestMapping(value= "/executeMysql",method = RequestMethod.POST)
	Boolean executeMysqlQuery(@RequestBody String query) {
		System.out.println(query);
		return true;
	}
}
