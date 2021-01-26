package com.tw.intern;

import java.util.List;

public class Friend {
    private String friendsName;
    private Integer amountSpent;
    private int amountOwe = 0;
    private List<String> friendsList;

    public Friend(String friendsName, Integer amountSpent, List<String> friendsList) {
        this.friendsName = friendsName;
        this.amountSpent = amountSpent;
        this.friendsList = friendsList;
    }


    public void setAmountOwe(int amountOwe) {
        this.amountOwe += amountOwe;
    }

    public String getFriendsName() {
        return friendsName;
    }

    public Integer getAmountSpent() {
        return amountSpent;
    }

    public int getAmountOwe() {
        return amountOwe;
    }

    public List<String> getFriendsList() {
        return friendsList;
    }
}

