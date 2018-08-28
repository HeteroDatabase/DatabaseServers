package com.heteroDB.MysqlServer.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mysql.jdbc.exceptions.jdbc4.MySQLSyntaxErrorException;

@Repository
public class MysqlQueryExecutionRepository {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public boolean executeQuery(String sql) throws MySQLSyntaxErrorException {
		try {
			jdbcTemplate.execute(sql);
			return true;
		}catch (Exception e) {
			return false;
		}
		
	}

}
