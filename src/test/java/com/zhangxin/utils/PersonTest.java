package com.zhangxin.utils;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class PersonTest {

	@Test
	public void test() {
		for (int i = 0; i <= 100; i++) {
			Person person=new Person();
			person.setId(i++);
			person.setName(ZHStringUtil.getZHName());
			person.setAge(RandNumUtil.random(1, 100));
			person.setGz(RandNumUtil.getValue(30000, 80000, 2));
			Calendar c = Calendar.getInstance();
			c.set(2012, 1, 1);
			SimpleDateFormat format=new SimpleDateFormat();
			person.setDatee(DateUtil.random(c.getTime(),new Date()));
			System.out.println(person);
		}
	}

}
