package com.example.dre1;

public class messages {

    String senderID;

    String receiverID;

    String text;

    String type;

    long delivery_time;

    long seen_time;

    long sent_time;

    messages(){}

    messages(String senderID, String receiverID,String text, String type, long delivery_time, long seen_time, long sent_time)
    {
        this.senderID= senderID;
        this.receiverID=receiverID;
        this.text=text;
        this.type=type;
        this.delivery_time=delivery_time;
        this.seen_time=seen_time;
        this.sent_time=sent_time;

    }
    String getSenderID(){
        return this.senderID;
    }
    void setSenderID(String senderID){
        this.senderID=senderID;
    }
    
    String getreceiverID(){
        return this.receiverID;
    }
    void setreceiverID(String receiverID){
        this.senderID=senderID;
    }

    String gettext(){
        return this.text;
    }
    void settext(String text){
        this.text=text;
    }

    String gettype(){
        return this.type;
    }
    void settype(String type){
        this.type=type;
    }

    long getdelivery_time(){
        return this.delivery_time;
    }
    void setDelivery_time(long delivery_time){
        this.delivery_time=delivery_time;
    }

    long getseen_time(){
        return this.seen_time;
    }
    void setseen_time(long seen_time){
        this.seen_time=seen_time;
    }

    long getSent_time(){
        return this.sent_time;
    }
    void setSeen_time(long sent_time){
        this.sent_time=sent_time;
    }

    public static void main(String[]args){
        messages msg1 = new messages();
        messages msg2=  new messages( "1", "2", "How are you?", "text", 100, 101, 102 );
    }
}
