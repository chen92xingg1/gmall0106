package com.atguigu.gmall.user.bean;



import java.io.Serializable;


public class UmsMember implements Serializable {

    private Long id;
    private Long memberLevelId;
    private String username;
    private String password;
    private String nickname;
    private String phone;
    private Integer status;
    private java.util.Date createTime;
    private String icon;
    private Integer gender;
    private java.util.Date birthday;
    private String city;
    private String job;
    private String personalizedSignature;
    private Integer sourceType;
    private Integer integration;
    private Integer growth;
    private Integer luckeyCount;
    private Integer historyIntegration;

    public void setId(Long value) {
        this.id = value;
    }
    public Long getId() {
       return this.id;
    }
    public void setMemberLevelId(Long value) {
        this.memberLevelId = value;
    }
    public Long getMemberLevelId() {
       return this.memberLevelId;
    }
    public void setUsername(String value) {
        this.username = value;
    }
    public String getUsername() {
       return this.username;
    }
    public void setPassword(String value) {
        this.password = value;
    }
    public String getPassword() {
       return this.password;
    }
    public void setNickname(String value) {
        this.nickname = value;
    }
    public String getNickname() {
       return this.nickname;
    }
    public void setPhone(String value) {
        this.phone = value;
    }
    public String getPhone() {
       return this.phone;
    }
    public void setStatus(Integer value) {
        this.status = value;
    }
    public Integer getStatus() {
       return this.status;
    }
    public void setCreateTime(java.util.Date value) {
        this.createTime = value;
    }
    public java.util.Date getCreateTime() {
       return this.createTime;
    }
    public void setIcon(String value) {
        this.icon = value;
    }
    public String getIcon() {
       return this.icon;
    }
    public void setGender(Integer value) {
        this.gender = value;
    }
    public Integer getGender() {
       return this.gender;
    }
    public void setBirthday(java.util.Date value) {
        this.birthday = value;
    }
    public java.util.Date getBirthday() {
       return this.birthday;
    }
    public void setCity(String value) {
        this.city = value;
    }
    public String getCity() {
       return this.city;
    }
    public void setJob(String value) {
        this.job = value;
    }
    public String getJob() {
       return this.job;
    }
    public void setPersonalizedSignature(String value) {
        this.personalizedSignature = value;
    }
    public String getPersonalizedSignature() {
       return this.personalizedSignature;
    }
    public void setSourceType(Integer value) {
        this.sourceType = value;
    }
    public Integer getSourceType() {
       return this.sourceType;
    }
    public void setIntegration(Integer value) {
        this.integration = value;
    }
    public Integer getIntegration() {
       return this.integration;
    }
    public void setGrowth(Integer value) {
        this.growth = value;
    }
    public Integer getGrowth() {
       return this.growth;
    }
    public void setLuckeyCount(Integer value) {
        this.luckeyCount = value;
    }
    public Integer getLuckeyCount() {
       return this.luckeyCount;
    }
    public void setHistoryIntegration(Integer value) {
        this.historyIntegration = value;
    }
    public Integer getHistoryIntegration() {
       return this.historyIntegration;
    }
}
