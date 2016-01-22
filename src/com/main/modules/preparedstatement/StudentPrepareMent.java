package com.main.modules.preparedstatement;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;

public class StudentPrepareMent implements PreparedStatementSetter{

	private static String sql = "SELECT max(id) from t_student";
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void setValues(PreparedStatement ps) throws SQLException {
		String maxId = getMaxId().toString();
		ps.setString(1, maxId);	
	}

	public Integer getMaxId(){
		
		int s = jdbcTemplate.queryForInt(sql);
		
		return s;
		
	}
	
}
