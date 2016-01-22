package com.main.modules.pojo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

/**
 * 
 * Title: StudentMapper.java Description:学员映射类.将read的结果组装为对象
 * 
 * @author pc-zw
 * @date 2016年1月13日下午4:03:56
 * @version 1.0
 */
public class StudentMapper implements RowMapper<Student> {

	/**
	 * 需要注意的是根据不同reader我们需要实现的类也不同 例如: FlatFileItemReader 需要实现 FieldSetMapper
	 * JdbcCursorItemReader 需要实现 RowMapper
	 */

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student = new Student();
		student.setStudentName(rs.getString("STUDENTNAME"));
		student.setAge(rs.getString("AGE"));
		return student;
	}

}
