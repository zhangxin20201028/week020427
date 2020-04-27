package com.zhangxin.utils;

import java.util.Random;

public class RandNumUtil {

	//方法1：获得指定范围的随机小数,精度scale表示小数点后位数，举例min为25400.56,max为67078.94,返回小数点后2位的min和max之间的数，比如48545.87（8分）
	public static double getValue(final double min, final double max,final int scale){
		Random ran=new Random();
		Double value=ran.nextDouble()*(max-min)+min;
		return value;
	//TODO 实现代码
	}
	
	//方法2：返回min-max之间的随机整数（包含min和不包含max值），例如返回1-3之间的随机数，则返回1或2，不能是其他数值（8分）
			public static int random(int min, int max){
				Random r= new Random();
				return r.nextInt(max-min+1)+min;
			}

}
