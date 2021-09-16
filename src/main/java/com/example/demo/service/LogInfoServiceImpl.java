package com.example.demo.service;


import com.example.demo.dao.LogInfoDao;
import com.example.demo.entity.LogInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogInfoServiceImpl {

    @Autowired
    private LogInfoDao logInfoDao;


    public int insertLog(LogInfo logInfo) {
        return logInfoDao.insertLog(logInfo);
    }

}
