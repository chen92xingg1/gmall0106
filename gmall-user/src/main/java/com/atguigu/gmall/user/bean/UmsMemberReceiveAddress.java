package com.atguigu.gmall.user.bean;



import java.io.Serializable;


public class UmsMemberReceiveAddress implements Serializable {

    private Long id;
    private Long memberId;
    private String name;
    private String phoneNumber;
    private Integer defaultStatus;
    private String postCode;
    private String province;
    private String city;
    private String region;
    private String detailAddress;

    public void setId(Long value) {
        this.id = value;
    }
    public Long getId() {
       return this.id;
    }
    public void setMemberId(Long value) {
        this.memberId = value;
    }
    public Long getMemberId() {
       return this.memberId;
    }
    public void setName(String value) {
        this.name = value;
    }
    public String getName() {
       return this.name;
    }
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }
    public String getPhoneNumber() {
       return this.phoneNumber;
    }
    public void setDefaultStatus(Integer value) {
        this.defaultStatus = value;
    }
    public Integer getDefaultStatus() {
       return this.defaultStatus;
    }
    public void setPostCode(String value) {
        this.postCode = value;
    }
    public String getPostCode() {
       return this.postCode;
    }
    public void setProvince(String value) {
        this.province = value;
    }
    public String getProvince() {
       return this.province;
    }
    public void setCity(String value) {
        this.city = value;
    }
    public String getCity() {
       return this.city;
    }
    public void setRegion(String value) {
        this.region = value;
    }
    public String getRegion() {
       return this.region;
    }
    public void setDetailAddress(String value) {
        this.detailAddress = value;
    }
    public String getDetailAddress() {
       return this.detailAddress;
    }
}
