package com.xxt.utils;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class JdbcUtils {
	/**
	 * 1.��ʼ��C3P0���ӳ�
	 */
	private static DataSource dataSource;
	static {
		dataSource=new ComboPooledDataSource();
	}
	/**
	 * 2.����DbUtil���Ĺ��������
	 */
	public static QueryRunner getQueryRunner(){
		//����QueryRunner���󣬴������ӳض���
		//�ڴ���QueryRunner�����ʱ���������������Դ����
		//��ô��ʹ��QueryRunner���󷽷���ʱ��Ͳ���Ҫ�������Ӷ���
		//���Զ�������Դ�л�ȡ����
		QueryRunner qr=new QueryRunner(dataSource);
		return qr;
	}
	public static DataSource getDataSource(){
		return dataSource;
		
	}
}
