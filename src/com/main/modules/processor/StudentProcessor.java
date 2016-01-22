package com.main.modules.processor;

import org.springframework.batch.item.ItemProcessor;

import com.main.modules.pojo.Student;


/**
 * 处理过程 Title: MessageProcessor.java Description: Company: www.edu24ol.com
 * 
 * @author pc-zw
 * @date 2015年12月31日下午2:55:43
 * @version 1.0
 */
public class StudentProcessor implements ItemProcessor<Student, Student> {

	// 定义一个输入对象 一个输出对象
	// Spring batch定义每次只处理一个。当结果达到写的标准统一提交给Writer
	// 这里我们可以定义我们自己的处理逻辑

	@Override
	public Student process(Student item) throws Exception {
		System.out.println("正在处理" + item.toString());
		return item;
	}

}
