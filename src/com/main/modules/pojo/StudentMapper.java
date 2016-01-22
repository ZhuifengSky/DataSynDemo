package com.main.modules.pojo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

/**
 * 
 * Title: StudentMapper.java Description:ѧԱӳ����.��read�Ľ����װΪ����
 * 
 * @author pc-zw
 * @date 2016��1��13������4:03:56
 * @version 1.0
 */
public class StudentMapper implements RowMapper<Student> {

	/**
	 * ��Ҫע����Ǹ��ݲ�ͬreader������Ҫʵ�ֵ���Ҳ��ͬ ����: FlatFileItemReader ��Ҫʵ�� FieldSetMapper
	 * JdbcCursorItemReader ��Ҫʵ�� RowMapper
	 */

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student = new Student();
		student.setStudentName(rs.getString("STUDENTNAME"));
		student.setAge(rs.getString("AGE"));
		return student;
	}

}
