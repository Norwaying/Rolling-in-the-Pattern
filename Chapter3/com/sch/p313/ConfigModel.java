package com.sch.p313;

/**
 * Created by Nov on 2015/5/14.
 */
public class ConfigModel {
    private boolean needGenPresentation = true;
    private boolean needGenBussiness = true;
    private boolean needGenDAO = true;

    public void setNeedGenPresentation(boolean needGenPresentation) {
        this.needGenPresentation = needGenPresentation;
    }
    public boolean isNeedGenPresentation(){
        return needGenPresentation;
    }

    public void setNeedGenBussiness(boolean needGenBussiness) {
        this.needGenBussiness = needGenBussiness;
    }
    public boolean isNeedGenBussiness(){
        return needGenBussiness;
    }

    public void setNeedGenDAO(boolean needGenDAO) {
        this.needGenDAO = needGenDAO;
    }
    public boolean isNeedGenDAO(){
        return needGenDAO;
    }
}
