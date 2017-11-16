package com.ycm.kata.mydemo2.bean;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Comparator;

/**
 * Created by changmuyu on 2017/8/15.
 * Description:问题实体类
 */

public class Question implements Parcelable, Comparator<Question> {
    public Long id;

    public Long fromId;

    public Long toId;

    public String title;

    public String content;

    public String mediaUrl;

    public Long reward;

    public Byte status;

    public Byte type;

    public Long createTime;

    public Long updateTime;

    public User fromUser;

    public User toUser;

    public Long getId() {
        return id == null ?  0 : id ;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFromId() {
        return fromId == null ?  0 : fromId;
    }

    public void setFromId(Long fromId) {
        this.fromId = fromId;
    }

    public Long getToId() {
        return toId == null ?  0 : toId;
    }

    public void setToId(Long toId) {
        this.toId = toId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getMediaUrl() {
        return mediaUrl;
    }

    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    public Long getReward() {
        return reward == null ? 0 : reward;
    }

    public void setReward(Long reward) {
        this.reward = reward;
    }

    public Byte getStatus() {
        return status == null ?  0 : status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Byte getType() {
        return type == null ?  0 : type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Long getCreateTime() {
        return createTime == null ?  0 : createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateTime() {
        return updateTime == null ?  0 : updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public User getFromUser() {
        return fromUser;
    }

    public void setFromUser(User fromUser) {
        this.fromUser = fromUser;
    }

    public User getToUser() {
        return toUser;
    }

    public void setToUser(User toUser) {
        this.toUser = toUser;
    }

    @Override
    public String toString() {
        return "id:" + id +
                " fromId:" + fromId +
                " toId:" + toId +
                " title:" + title +
                " content:" + content +
                " mediaUrl:" + mediaUrl +
                " reward:" + reward +
                " status:" + status +
                " type" + type +
                " createTime" + createTime +
                " updateTime" + updateTime +
                " fromUser" + " [" + fromUser.id + "] " +
                " toUser" + " [" + toUser.id + "] ";
    }

//    @Override
//    public int compare(Question o1, Question o2) {
//        long time1;
//        long time2;
//        if (o1.getUpdateTime() != null) {
//            time1 = o1.getUpdateTime();
//        } else {
//            time1 = o1.getCreateTime();
//        }
//
//        if (o2.getUpdateTime() != null) {
//            time2 = o2.getUpdateTime();
//        } else {
//            time2 = o2.getCreateTime();
//
//        }
//
//        if (time1 > time2) {
//            return 1;
//        } else if (time1 == time2) {
//            return 0;
//        } else {
//            return -1;
//        }
//    }

    @Override
    public int compare(Question o1, Question o2) {
        long time1;
        long time2;
        if (o1.getUpdateTime() != null) {
            time1 = o1.getUpdateTime();
        } else {
            time1 = o1.getCreateTime();
        }

        if (o2.getUpdateTime() != null) {
            time2 = o2.getUpdateTime();
        } else {
            time2 = o2.getCreateTime();

        }

        if (time1 > time2) {
            return 1;
        } else if (time1 == time2) {
            return 0;
        } else {
            return -1;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Question) {
            Question question = (Question) obj;
            return id != 0 && question.getId() != 0 && (long) id == question.getId();
        }
        return false;
    }

    //    @Override
//    public int describeContents() {
//        return 0;
//    }
//
//    @Override
//    public void writeToParcel(Parcel dest, int flags) {
//        dest.writeString(title);
//        dest.writeString(content);
//        dest.writeString(mediaUrl);
//        dest.writeLong(id);
//        dest.writeLong(fromId);
//        dest.writeLong(toId);
//        dest.writeLong(reward);
//        dest.writeByte(status);
//        dest.writeByte(type);
//        dest.writeLong(createTime);
//        dest.writeLong(updateTime);
//        dest.writeTypedObject(fromUser);
//        dest.writeString(toUser);
//    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.id);
        dest.writeValue(this.fromId);
        dest.writeValue(this.toId);
        dest.writeString(this.title);
        dest.writeString(this.content);
        dest.writeString(this.mediaUrl);
        dest.writeValue(this.reward);
        dest.writeValue(this.status);
        dest.writeValue(this.type);
        dest.writeValue(this.createTime);
        dest.writeValue(this.updateTime);
        dest.writeParcelable(this.fromUser, flags);
        dest.writeParcelable(this.toUser, flags);
    }

    public Question() {
    }

    protected Question(Parcel in) {
        this.id = (Long) in.readValue(Long.class.getClassLoader());
        this.fromId = (Long) in.readValue(Long.class.getClassLoader());
        this.toId = (Long) in.readValue(Long.class.getClassLoader());
        this.title = in.readString();
        this.content = in.readString();
        this.mediaUrl = in.readString();
        this.reward = (Long) in.readValue(Long.class.getClassLoader());
        this.status = (Byte) in.readValue(Byte.class.getClassLoader());
        this.type = (Byte) in.readValue(Byte.class.getClassLoader());
        this.createTime = (Long) in.readValue(Long.class.getClassLoader());
        this.updateTime = (Long) in.readValue(Long.class.getClassLoader());
        this.fromUser = in.readParcelable(User.class.getClassLoader());
        this.toUser = in.readParcelable(User.class.getClassLoader());
    }

    public static final Creator<Question> CREATOR = new Creator<Question>() {
        @Override
        public Question createFromParcel(Parcel source) {
            return new Question(source);
        }

        @Override
        public Question[] newArray(int size) {
            return new Question[size];
        }
    };
}
