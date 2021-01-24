package com.tw.assignment;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TripExpenditure {
    static List<Friends> friendsList = new LinkedList<>();
    static Scanner scanner = new Scanner(System.in);
    static List<String> result=new LinkedList<>();

    public void friendListInitialization(int numberOfFriends) {
        for (int index = 0; index < numberOfFriends; index++) {
            Friends friendObj = new Friends();
            System.out.println("Enter the Friend Name:");
            String friendName = scanner.next();
            System.out.println("Enter Amount spent during trip");
            int amountSpent = scanner.nextInt();
            friendObj.setFriendName(friendName);
            friendObj.setAmountSpent(amountSpent);
            friendsList.add(friendObj);
        }
        expenditureUpdation();
    }

    public static void expenditureUpdation() {
        for (int index = 0; index < friendsList.size(); index++) {
            System.out.println("Mr. "+friendsList.get(index).getFriendName()+", Enter the number of friend for whom you have spent the money excluding you:");
            int countOfFriends = scanner.nextInt();
            System.out.println("Enter '0' if it doesn't includes you or else '1' if it includes you");
            int includedOrNot = scanner.nextInt();
            if (includedOrNot == 1) {
                friendsList.get(index).setAmountOwe(friendsList.get(index).getAmountSpent() / (countOfFriends + includedOrNot));
            }
            System.out.println("Enter the name of the friend for whom you have spent the money excluding you line by line");
            for (int count = 0; count < countOfFriends; count++) {
                String nameOfFriend = scanner.next();
                int amountPerPerson = friendsList.get(index).getAmountSpent() / (countOfFriends + includedOrNot);

                for (int indexInTheList = 0; indexInTheList < friendsList.size(); indexInTheList++) {
                    if ((friendsList.get(indexInTheList).getFriendName()).equals(nameOfFriend)) {
                        friendsList.get(indexInTheList).setAmountOwe(friendsList.get(indexInTheList).getAmountOwe() + amountPerPerson);
                    }
                }
            }
            amountCalculator(friendsList);


        }
    }

    public static List<String> amountCalculator(List<Friends> friendsList) {
        for (int index = 0; index < friendsList.size(); index++) {
            int calculatedAmount = friendsList.get(index).getAmountOwe() - friendsList.get(index).getAmountSpent();
            if (calculatedAmount < 0) {
                result.add(friendsList.get(index).getFriendName() + " gets " + calculatedAmount);
            } else {
                result.add(friendsList.get(index).getFriendName() + " gives" + calculatedAmount);
            }
        }
        return result;

    }
}


