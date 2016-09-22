package com.mahl.DaoTest;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mahl.dto.PageHelper;
import com.mahl.dto.WindingMachineForm;
import com.mahl.pojo.WindingMachine;
import com.mahl.service.IUserAction;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class UserActionTest {

	@Autowired
	public IUserAction userAction;

	@Test
	public void getWindingMachinesByPage() {
		PageHelper page = new PageHelper();

		page.setEnd(20);
		page.setStart(10);
		page.setRows(10);
		page.setPage(2);
		page.setSort("desc");
		page.setOrder("test");

		List<WindingMachineForm> list = userAction.getWindingMachinesByPage(page);

		for (WindingMachineForm windingMachineForm : list) {
			System.out.println(windingMachineForm.toString());
		}
	}

	@Test
	public void testgetWindingTotalRows() {
		System.out.println(userAction.getWindingTotalRows());
	}

}
