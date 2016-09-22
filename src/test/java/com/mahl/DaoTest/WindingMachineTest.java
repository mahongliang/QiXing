package com.mahl.DaoTest;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import com.mahl.dao.WindingMachineDao;
import com.mahl.dto.PageHelper;
import com.mahl.pojo.WindingMachine;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class WindingMachineTest {

	@Autowired
	private WindingMachineDao windingMachineDao;

	@Test
	public void testfindByPage(){
		PageHelper page = new PageHelper();
		
		page.setEnd(20);
		page.setStart(10);
		page.setRows(10);
		page.setPage(2);
		page.setSort("desc");
		page.setOrder("test");
		
		List<WindingMachine> list = windingMachineDao.findByPage(page);
		
		for (WindingMachine windingMachine : list) {
			System.out.println(windingMachine.toString());
		}
		
	}
	
	@Test
	public void testgetTotalRows(){
		System.out.println("test"+windingMachineDao.getTotalRows());
	}
}
