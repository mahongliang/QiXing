package com.mahl.dao;

import java.util.List;

import com.mahl.pojo.BaomoMachine;

public interface BaomoMachineDao {
    int insert(BaomoMachine record);

    List<BaomoMachine> getAll();
}