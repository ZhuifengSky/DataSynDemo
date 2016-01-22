package com.main.modules.processor;

import org.springframework.batch.item.ItemProcessor;

import com.main.modules.pojo.Student;


/**
 * ������� Title: MessageProcessor.java Description: Company: www.edu24ol.com
 * 
 * @author pc-zw
 * @date 2015��12��31������2:55:43
 * @version 1.0
 */
public class StudentProcessor implements ItemProcessor<Student, Student> {

	// ����һ��������� һ���������
	// Spring batch����ÿ��ֻ����һ����������ﵽд�ı�׼ͳһ�ύ��Writer
	// �������ǿ��Զ��������Լ��Ĵ����߼�

	@Override
	public Student process(Student item) throws Exception {
		System.out.println("���ڴ���" + item.toString());
		return item;
	}

}
