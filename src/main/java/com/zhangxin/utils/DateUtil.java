package com.zhangxin.utils;

import java.util.Calendar;
import java.util.Date;

/**
 * 
 * @ClassName: DateUtil 
 * @Description: 日期工具类
 * @author: charles
 * @date: 2020年4月23日 下午4:38:21
 */
public class DateUtil {
	
	
	/**
	 * 
	 * @Title: getAgeByBirthday 
	 * @Description: 根据日期计算年龄
	 * @param birthday
	 * @return
	 * @return: int
	 */
	public static int getAgeByBirthday(Date  birthday) {
		
		//1获取系统当前年 月 日
		Calendar c = Calendar.getInstance();
		int nowYear = c.get(Calendar.YEAR);
		int nowMonth = c.get(Calendar.MONTH);
		int nowDate = c.get(Calendar.DAY_OF_MONTH);
		//2获取传入日期的生日的年 月 日
		Calendar c2 = Calendar.getInstance();
		c2.setTime(birthday);
		int birthdayYear = c2.get(Calendar.YEAR);
		int birthdayMonth = c2.get(Calendar.MONTH);
		int birthdayDate = c2.get(Calendar.DAY_OF_MONTH);
		if(nowYear< birthdayYear)//判断
			throw new RuntimeException("传入的日期错误");
		//4.两个年份向减 得到年龄 2000-04-01
		 int age =  nowYear - birthdayYear;
		 //没有到出生的月则年龄减去1
		 if(nowMonth < birthdayMonth  ) 
		    age--;
		 //没有到出生日 年龄减去1
		 if(nowMonth ==birthdayMonth && nowDate<birthdayDate )
			 age--;
		return age;
		
		
	}
	
	/**
	 * 
	 * @Title: getInitMonth 
	 * @Description: 根据传入的日期返回日期的月初。如传入 2020-04-24 ，返回 2020-04-01 00:00:00
	 * @param date
	 * @return
	 * @return: Date
	 */
	public static Date getInitMonth(Date date) {
		//Calendar 是一个日历类。提供 设置日期，加减日期等方法，方便程序员对日期做计算
		Calendar c = Calendar.getInstance();//初始化一个日历类
		//用传入的日期初始化日历类
		c.setTime(date);
		//设置这个月月初即：改变这个月的日期为第一天
		c.set(Calendar.DAY_OF_MONTH, 1);//设置天为1
		c.set(Calendar.HOUR_OF_DAY, 0);//设置小时为0
		c.set(Calendar.MINUTE, 0);//设置分钟为0
		c.set(Calendar.SECOND,0);//设置秒为0
		return c.getTime();
		
	}
	/**
	 * 
	 * @Title: getEndMonth 
	 * @Description: 根据传入的日期返回日期的月初。如传入 2020-04-24  ，返回 2020-04-30 23:59:59
	 * @param date
	 * @return
	 * @return: Date
	 */
	public static Date getEndMonth(Date date) {
		//Calendar 是一个日历类。提供 设置日期，加减日期等方法，方便程序员对日期做计算
		Calendar c = Calendar.getInstance();//初始化一个日历类
		//用传入的日期初始化日历类
		c.setTime(date);
		//让月加1  2020-05-24 ， 再变成月初 2020-05-01    再 减去一秒，再获取日期
		c.add(Calendar.MONTH, 1); //让月加1  2020-05-24
		Date nexMonthInit = getInitMonth(c.getTime());//再变成月初 2020-05-01
		//初始化日历类
		c.setTime(nexMonthInit);
		c.add(Calendar.SECOND, -1);//再 减去一秒
		return c.getTime();
		
	}
	
	
	
	
	/**
	 * 
	 * @Title: random 
	 * @Description: 随机产生一个min 和max之间的日期
	 * @param min
	 * @param object
	 * @return
	 * @return: Date
	 */
	public static Date random(Date min ,Object object) {
		long t1 = min.getTime();
		long t2 = ((Date) object).getTime();
	
		long t = (long) (Math.random() * (t2 -t1) + t1);
		return new Date(t);
		
	}

}
