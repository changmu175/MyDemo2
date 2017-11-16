package com.ycm.kata.mydemo2.bean;

import java.util.List;

/**
 * Created by changmuyu on 2017/9/2.
 * Description:
 */

public class Version {
    private int id;

    private int versionCode;

    private String versionName;

    private String introduction;

    private String downloadUrl;

    private int earliestVersionSupported;

    private String bugFixVersions;

    private Long createTime;

    private Long updateTime;

    private List<Integer> bugFixVersionCodeList;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setVersionCode(int versionCode) {
        this.versionCode = versionCode;
    }

    public int getVersionCode() {
        return this.versionCode;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public String getVersionName() {
        return this.versionName;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getIntroduction() {
        return this.introduction;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public void setEarliestVersionSupported(int earliestVersionSupported) {
        this.earliestVersionSupported = earliestVersionSupported;
    }

    public int getEarliestVersionSupported() {
        return this.earliestVersionSupported;
    }

    public void setBugFixVersions(String bugFixVersions) {
        this.bugFixVersions = bugFixVersions;
    }

    public String getBugFixVersions() {
        return this.bugFixVersions;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getCreateTime() {
        return this.createTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public Long getUpdateTime() {
        return this.updateTime;
    }

    public void setBugFixVersionCodeList(List<Integer> bugFixVersionCodeList) {
        this.bugFixVersionCodeList = bugFixVersionCodeList;
    }

    public List<Integer> getBugFixVersionCodeList() {
        return this.bugFixVersionCodeList;
    }
}
