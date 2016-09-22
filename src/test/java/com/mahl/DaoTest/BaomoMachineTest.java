package com.mahl.DaoTest;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mahl.dao.BaomoMachineDao;

import com.mahl.dto.PageHelper;
import com.mahl.pojo.BaomoMachine;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class BaomoMachineTest {

	@Autowired
	private BaomoMachineDao baomoMachineDao;

	@Test
	public void testfindByPage(){
		PageHelper page = new PageHelper();
		
		page.setEnd(10);
		page.setStart(0);
		page.setRows(10);
		page.setPage(1);
		page.setSort("desc");
		page.setOrder("test");
		
		List<BaomoMachine> list = baomoMachineDao.findByPage(page);
		
		for (BaomoMachine baomoMachine : list) {
			System.out.println(baomoMachine.toString());
		}
		
	}
	
	@Test
	public void testgetTotalRows(){
		System.out.println("test"+baomoMachineDao.getTotalRows());
	}
}
