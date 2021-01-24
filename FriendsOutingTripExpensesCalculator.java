package com.tw.assignment;

import java.util.*;


public class FriendsOutingTripExpensesCalculator {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number Of Friends");
        int numberOfFriends = scanner.nextInt();
        TripExpenditure tripObj = new TripExpenditure();
        tripObj.friendListInitialization(numberOfFriends);
    }

}


