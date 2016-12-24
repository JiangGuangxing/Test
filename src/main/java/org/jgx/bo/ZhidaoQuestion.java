package org.jgx.bo;

import java.util.Date;

public class ZhidaoQuestion {
    private Long id;

    private Long zhubingQuestionId;

    private Date creatTime;

    private String zhidaoUserName;

    private Long zhidaoUserId;

    private Long zhidaoQuestionId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getZhubingQuestionId() {
        return zhubingQuestionId;
    }

    public void setZhubingQuestionId(Long zhubingQuestionId) {
        this.zhubingQuestionId = zhubingQuestionId;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public String getZhidaoUserName() {
        return zhidaoUserName;
    }

    public void setZhidaoUserName(String zhidaoUserName) {
        this.zhidaoUserName = zhidaoUserName == null ? null : zhidaoUserName.trim();
    }

    public Long getZhidaoUserId() {
        return zhidaoUserId;
    }

    public void setZhidaoUserId(Long zhidaoUserId) {
        this.zhidaoUserId = zhidaoUserId;
    }

    public Long getZhidaoQuestionId() {
        return zhidaoQuestionId;
    }

    public void setZhidaoQuestionId(Long zhidaoQuestionId) {
        this.zhidaoQuestionId = zhidaoQuestionId;
    }
}