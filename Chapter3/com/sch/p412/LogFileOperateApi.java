package com.sch.p412;

import java.util.List;

/**
 * Created by Nov on 2015/5/15.
 */
public interface LogFileOperateApi {
    public List<LogModel> readLogFile();
    public void writeLogFile(List<LogModel> list);
}
