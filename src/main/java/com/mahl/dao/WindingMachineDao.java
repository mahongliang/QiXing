package com.mahl.dao;


import java.util.List;

import com.mahl.pojo.WindingMachine;


public interface WindingMachineDao {
    int insert(WindingMachine record);

    int insertSelective(WindingMachine record);
   
    
    List<WindingMachine> getAll();

}