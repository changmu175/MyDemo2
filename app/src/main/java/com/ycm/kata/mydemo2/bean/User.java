package com.ycm.kata.mydemo2.bean;

import android.os.Parcel;
import android.os.Parcelable;

import java.math.BigDecimal;

/**
 * Created by Administrator on 2017/3/22.
 */

public class User implements Parcelable {
    public Long id;
    public String mobile;
    public Byte status;
    public Long createTime;
    private String name;
    public String title;
    public String portraitUrl;

    // true male
    private Boolean sex;
    public Long birthday;
    // 签名
    public String introduction;
    public BigDecimal drawableBalance; // 可提现余额
    public BigDecimal undrawableBalance;
    public Integer followerCount;
    public Integer followeeCount;
    public String token;
    public Long tokenExpireTime;

    //新增
    public int cityCode;
    public String cityName;
    public BigDecimal balance; /// 总余额
    private Boolean isCertificated;
    public Byte questionStatus;
    public Long questionPrice;

    public Boolean getSex() {
        return sex == null ? true : sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Byte getStatus() {
        return status == null ? 0 : status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Long getCreateTime() {
        return createTime == null ? 0 : createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPortraitUrl() {
        return portraitUrl;
    }

    public void setPortraitUrl(String portraitUrl) {
        this.portraitUrl = portraitUrl;
    }

    public Long getBirthday() {
        return birthday == null ? 0 : birthday;
    }

    public void setBirthday(Long birthday) {
        this.birthday = birthday;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public BigDecimal getDrawableBalance() {
        return drawableBalance == null ? BigDecimal.valueOf(0) : drawableBalance;
    }

    public void setDrawableBalance(BigDecimal drawableBalance) {
        this.drawableBalance = drawableBalance;
    }

    public BigDecimal getUndrawableBalance() {
        return undrawableBalance == null ? BigDecimal.valueOf(0) : undrawableBalance;
    }

    public void setUndrawableBalance(BigDecimal undrawableBalance) {
        this.undrawableBalance = undrawableBalance;
    }

    public Integer getFollowerCount() {
        return followerCount == null ? 0 : followerCount;
    }

    public void setFollowerCount(Integer followerCount) {
        this.followerCount = followerCount;
    }

    public Integer getFolloweeCount() {
        return followeeCount   == null ? 0 : followeeCount;
    }

    public void setFolloweeCount(Integer followeeCount) {
        this.followeeCount = followeeCount;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Long getTokenExpireTime() {
        return tokenExpireTime   == null ? 0 : tokenExpireTime;
    }

    public void setTokenExpireTime(Long tokenExpireTime) {
        this.tokenExpireTime = tokenExpireTime;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public BigDecimal getBalance() {
        return balance   == null ? BigDecimal.valueOf(0) : balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Boolean getCertificated() {
        return isCertificated   == null ? false : isCertificated;
    }

    public void setCertificated(Boolean certificated) {
        isCertificated = certificated;
    }

    public Byte getQuestionStatus() {
        return questionStatus  == null ? 0 : questionStatus;
    }

    public void setQuestionStatus(Byte questionStatus) {
        this.questionStatus = questionStatus;
    }

    public Long getQuestionPrice() {
        return questionPrice == null ? 0 : questionPrice;
    }

    public void setQuestionPrice(Long questionPrice) {
        this.questionPrice = questionPrice;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof User)) {
           return false;
        }

        User user = (User) obj;
        return (long)user.id == id;
    }

    public User(Long id, String name, String portraitUrl, Boolean sex, String introduction) {
        this.id = id;
        this.name = name;
        this.portraitUrl = portraitUrl;
        this.sex = sex;
        this.introduction = introduction;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.id);
        dest.writeString(this.mobile);
        dest.writeValue(this.status);
        dest.writeValue(this.createTime);
        dest.writeString(this.name);
        dest.writeString(this.title);
        dest.writeString(this.portraitUrl);
        dest.writeValue(this.sex);
        dest.writeValue(this.birthday);
        dest.writeString(this.introduction);
        dest.writeSerializable(this.drawableBalance);
        dest.writeSerializable(this.undrawableBalance);
        dest.writeValue(this.followerCount);
        dest.writeValue(this.followeeCount);
        dest.writeString(this.token);
        dest.writeValue(this.tokenExpireTime);
        dest.writeInt(this.cityCode);
        dest.writeString(this.cityName);
        dest.writeSerializable(this.balance);
        dest.writeValue(this.isCertificated);
        dest.writeValue(this.questionStatus);
        dest.writeValue(this.questionPrice);
    }

    protected User(Parcel in) {
        this.id = (Long) in.readValue(Long.class.getClassLoader());
        this.mobile = in.readString();
        this.status = (Byte) in.readValue(Byte.class.getClassLoader());
        this.createTime = (Long) in.readValue(Long.class.getClassLoader());
        this.name = in.readString();
        this.title = in.readString();
        this.portraitUrl = in.readString();
        this.sex = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.birthday = (Long) in.readValue(Long.class.getClassLoader());
        this.introduction = in.readString();
        this.drawableBalance = (BigDecimal) in.readSerializable();
        this.undrawableBalance = (BigDecimal) in.readSerializable();
        this.followerCount = (Integer) in.readValue(Integer.class.getClassLoader());
        this.followeeCount = (Integer) in.readValue(Integer.class.getClassLoader());
        this.token = in.readString();
        this.tokenExpireTime = (Long) in.readValue(Long.class.getClassLoader());
        this.cityCode = in.readInt();
        this.cityName = in.readString();
        this.balance = (BigDecimal) in.readSerializable();
        this.isCertificated = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.questionStatus = (Byte) in.readValue(Byte.class.getClassLoader());
        this.questionPrice = (Long) in.readValue(Long.class.getClassLoader());
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel source) {
            return new User(source);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };
}
