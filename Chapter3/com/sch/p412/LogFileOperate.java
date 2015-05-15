package com.sch.p412;

import java.io.*;
import java.util.List;

/**
 * Created by Nov on 2015/5/15.
 */
public class LogFileOperate implements LogFileOperateApi {
    private String logFilePathName = "AdapterLog.log";

    public LogFileOperate(String logFilePathName) {
        if(logFilePathName!=null&&logFilePathName.trim().length()>0)
            logFilePathName = logFilePathName;
    }

    @Override
    public List<LogModel> readLogFile() {
        List<LogModel> list = null;
        ObjectInputStream oin = null;
        File f = new File(logFilePathName);
        if(f.exists()){
            try {
                oin = new ObjectInputStream(new BufferedInputStream(new FileInputStream(f)));
                list = (List<LogModel>)oin.readObject();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } finally {
                if(oin!=null)
                    try {
                        oin.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
            }

        }
        return list;
    }

    @Override
    public void writeLogFile(List<LogModel> list) {
        File f = new File(logFilePathName);
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(f)));
            oos.writeObject(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
