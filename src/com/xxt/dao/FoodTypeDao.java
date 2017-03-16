package com.xxt.dao;

import java.util.List;

import com.xxt.entity.FoodType;

public interface FoodTypeDao {
	/*
	 * ���
	 */
	void save(FoodType foodtype);
	/*
	 * ����
	 */
	void update(FoodType foodtype);
	/*
	 * ɾ��
	 */
	void delete(int id);
	/*
	 * ��ѯȫ��
	 */
	List<FoodType> getAll();
	/*
	 * ������������
	 */
	List<FoodType> getAll(String typeName);
	/*
	 * ����������ѯ
	 */
	FoodType findById(int id);
	
	
}
