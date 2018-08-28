package com.heteroDB.MysqlServer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.heteroDB.MysqlServer.repository.MysqlQueryExecutionRepository;
import com.mysql.jdbc.exceptions.jdbc4.MySQLSyntaxErrorException;

@RestController
public class MysqlQueryExecutionController {
	
	@Autowired
	MysqlQueryExecutionRepository mysqlQueryExecutionRepository;
	
	@RequestMapping(value= "/executeMysql",method = RequestMethod.POST)
	Boolean executeMysqlQuery(@RequestBody String query) {
		
		System.out.println(query);
		try {
			return mysqlQueryExecutionRepository.executeQuery(query);
		} catch (MySQLSyntaxErrorException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			return false;
		}
		//return null;
	}
}
