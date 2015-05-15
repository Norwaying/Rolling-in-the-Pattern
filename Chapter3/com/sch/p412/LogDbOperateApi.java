package com.sch.p412;


import java.util.List;

/**
 * Created by Nov on 2015/5/15.
 */
public interface LogDbOperateApi {
    public void createLog(LogModel lm);
    public void updateLog(LogModel lm);
    public void removeLog(LogModel lm);
    public List<LogModel> getAllLog();
}
