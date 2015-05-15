package com.sch.p412;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nov on 2015/5/15.
 * 适配器的本质：转换匹配，复用功能。
 */
public class Client {
    public static void main(String[] args){
        LogModel lm = new LogModel();
        lm.setLogId("001");
        lm.setOperateUser("admin");
        lm.setOperateTime("2015-05-15");
        lm.setLogContent("this is test");
/*
        List<LogModel> writeList = new ArrayList<LogModel>();
        writeList.add(lm);
        LogFileOperateApi api = new LogFileOperate("");
        api.writeLogFile(writeList);

        List<LogModel> readLog = api.readLogFile();
        System.out.println(readLog);
        */
        List<LogModel> writeList = new ArrayList<LogModel>();
        writeList.add(lm);
        LogFileOperateApi logFileOperateApi = new LogFileOperate("");
        LogDbOperateApi logDbOperateApi = new Adapter(logFileOperateApi);
        logDbOperateApi.createLog(lm);
        List<LogModel> readLog = logDbOperateApi.getAllLog();
        System.out.println(readLog);

    }
}
