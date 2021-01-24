package com.tw.assignment;
public class Friends {
    private String friendName;
    private int amountSpent;
    private int amountOwe;

    public int getAmountOwe() {
        return amountOwe;
    }

    public int getAmountSpent() {
        return amountSpent;
    }

    public String getFriendName() {
        return friendName;
    }

    public void setAmountOwe(int amountOwe) {
        this.amountOwe = amountOwe;
    }

    public void setAmountSpent(int amountSpent) {
        this.amountSpent = amountSpent;
    }


    public void setFriendName(String friendName) {
        this.friendName = friendName;
    }
}

