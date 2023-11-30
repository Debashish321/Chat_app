package com.example.dre1;

public class userProfile {

    String uname;

    String uid;

    String dp;

    String dob;

    String email;

    long phn_num;

    Character gender;

    userProfile(){}

    userProfile(String uname, String uid, String dp, String dob, String email, long phn_num, Character gender){
        this.uname=uname;
        this.uid=uid;
        this.dp=dp;
        this.dob=dob;
        this.email=email;
        this.phn_num=phn_num;
        this.gender=gender;
    }
    String getUname(){
        return this.uname;
    }
    void setUname(String uname){
        this.uname=uname;
    }

    String getUid(){
        return this.uid;
    }
    void setUid(String uid){
        this.uid=uid;
    }

    String getDp(){
        return this.dp;
    }
    void setDp(String dp){
        this.dp=dp;
    }

    String getDob(){
        return this.dob;
    }
    void setDob(String dob){
        this.dob=dob;
    }

    String getEmail(){
        return this.email;
    }
    void setEmail(String email){
        this.email=email;
    }

    long getPhn_num(){
        return this.phn_num;
    }
    void setPhn_num(long phn_num){
        this.phn_num=phn_num;
    }

    Character getGender(){
        return this.gender;
    }
    void setGender(Character gender){
        this.gender=gender;
    }

    public static void main(String[]args){
        userProfile user1= new userProfile();
        userProfile user2= new userProfile("Debashish", "1", "/abc/def", "04/11/98",
                "abcdef@gmail.com", "1234567890", 'M');
    }
}
