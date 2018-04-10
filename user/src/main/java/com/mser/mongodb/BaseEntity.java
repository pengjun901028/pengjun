package com.mser.mongodb;

import java.util.Date;

/**
 * Created by sunson on 2017/6/30.
 */
public class BaseEntity {

    public final static int STATUS_DEL = 0;
    public final static int STATUS_OK = 1;

    int status;
    Date createTime;
    Date updateTime;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
        this.updateTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
