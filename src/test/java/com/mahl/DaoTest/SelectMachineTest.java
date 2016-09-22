package com.mahl.DaoTest;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mahl.dao.SelectMachineDao;
import com.mahl.dto.PageHelper;
import com.mahl.pojo.SelectMachine;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class SelectMachineTest {
	
	@Autowired
	private SelectMachineDao selectMachineDao;

	@Test
	public void testfindByPage(){
		PageHelper page = new PageHelper();
		
		page.setEnd(20);
		page.setStart(10);
		page.setRows(10);
		page.setPage(2);
		page.setSort("desc");
		page.setOrder("test");
		
		List<SelectMachine> list = selectMachineDao.findByPage(page);
		
		for (SelectMachine selectMachine : list) {
			System.out.println(selectMachine.toString());
		}
		
	}
	
	@Test
	public void testgetTotalRows(){
		System.out.println("test"+selectMachineDao.getTotalRows());
	}
	

}
