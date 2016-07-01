package com.test.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.test.dao.TestDao;

@Service
public class TestService {

	private TestDao testDao;

	public void setTestDao(TestDao testDao) {
		this.testDao = testDao;
	}
	
	public int test(String name, int num) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", name);
		map.put("num", num+"");
		return testDao.test(map);
	}
}
