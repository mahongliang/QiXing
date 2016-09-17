//package com.mahl.DaoTest;
//
//import java.io.IOException;
//import java.io.Reader;
//import java.util.Date;
//import java.util.List;
//
//import org.apache.ibatis.io.Resources;
//import org.apache.ibatis.session.SqlSession;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.apache.ibatis.session.SqlSessionFactoryBuilder;
//
//import org.junit.Test;
//
//import com.mahl.dao.SelectMachineDao;
//import com.mahl.pojo.SelectMachine;
//
//public class SelectMachineTest {
//
//	@Test
//	public void testInsert() throws IOException {
//		Reader reader = Resources.getResourceAsReader("MybatisSql.xml");
//		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
//		SqlSession session = sqlSessionFactory.openSession();
//		
//		SelectMachineDao selectMachineDao = session.getMapper(SelectMachineDao.class);
//		
////		SelectMachine selectMachine = new SelectMachine();
////		selectMachine.setMachineId(120);
////		selectMachine.setMachineState(true);	
////		selectMachine.setEmployeeName("test");
////		
////		selectMachine.setFirstGrade(100);
////		selectMachine.setSecondGrade(200);
////		selectMachine.setThirdGrade(300);
////		
////		selectMachine.setErrorTime(10);
////		selectMachine.setIdleTime(20);
////		selectMachine.setRunTime(30);
////		
////		selectMachine.setRecordTime(new Date());
//		
//		
//		List<SelectMachine> list = selectMachineDao.getAll();
//		
//		for (SelectMachine selectMachine : list) {
//			System.out.print(selectMachine.getMachineId()+" ");
//			
//			System.out.print(selectMachine.getEmployeeName()+" ");
//			System.out.print(selectMachine.getMachineState()+" ");
//			
//			System.out.print(selectMachine.getFirstGrade()+" ");
//			System.out.print(selectMachine.getSecondGrade()+" ");
//			System.out.print(selectMachine.getThirdGrade()+" ");
//			
//			System.out.print(selectMachine.getRunTime()+" ");		
//			System.out.print(selectMachine.getErrorTime()+" ");
//			System.out.print(selectMachine.getIdleTime()+" ");
//			System.out.println(selectMachine.getRecordTime());
//			
//			System.out.println();
//
//		}
//	
//		
//		System.out.println("record inserted successfully");
//	
//		session.close();
//	}
//
//}
