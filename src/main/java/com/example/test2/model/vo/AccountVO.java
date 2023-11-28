package com.example.test2.model.vo;

import java.sql.Date;

//        IDX	NUMBER
//        USERID	VARCHAR2(20 BYTE)
//        USERPW	VARCHAR2(128 BYTE)
//        NICK	VARCHAR2(100 BYTE)
//        EMAIL	VARCHAR2(100 BYTE)
//        JOIN_DATE	DATE
public class AccountVO {
    private int idx;
    private String userid, userpw, nick, email;
    private Date join_date;

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUserpw() {
        return userpw;
    }

    public void setUserpw(String userpw) {
        this.userpw = userpw;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getJoin_date() {
        return join_date;
    }

    public void setJoin_date(Date join_date) {
        this.join_date = join_date;
    }
}
