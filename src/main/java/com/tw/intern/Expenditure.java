package com.tw.intern;

import java.util.ArrayList;
import java.util.List;

public class Expenditure {

    static List<String> resultList = new ArrayList<>();

    public void calculate(List<Friend> friendList) {
        int numberOfFriends = friendList.size();
        for (int index = 0; index < numberOfFriends; index++) {
            update(friendList.get(index), friendList);
        }
        result(friendList);
    }

    public static void update(Friend friend, List<Friend> friendList) {

        int countOfFriends = friend.getFriendsList().size();
        int amountSpentPerPerson = friend.getAmountSpent() / countOfFriends;
        for (int index = 0; index < friend.getFriendsList().size(); index++) {
            assign(amountSpentPerPerson, friend.getFriendsList().get(index), friendList);
        }


    }

    public static void assign(int amountSpentPerPerson, String friendName, List<Friend> friendList) {
        for (Friend friend : friendList) {
            if (friend.getFriendsName().equals(friendName)) {
                friend.setAmountOwe(amountSpentPerPerson);
                break;
            }
        }

    }

    public static void result(List<Friend> friendList) {

        for (Friend friend : friendList) {
            int resultantAmount = Math.abs(friend.getAmountSpent() - friend.getAmountOwe());
            if (friend.getAmountSpent() - friend.getAmountOwe() > 0) {
                resultList.add(friend.getFriendsName() + " gets " + resultantAmount);


            } else {
                resultList.add(friend.getFriendsName() + " gives " + resultantAmount);

            }
        }


    }

}

