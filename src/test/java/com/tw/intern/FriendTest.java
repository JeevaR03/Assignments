package com.tw.intern;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FriendTest {
    @Test

    public void shouldReturnResult() {
        //Given
        int numberOfFriends = 4;
        List<String> friendName = Arrays.asList("A", "B", "C", "D");
        List<Integer> amountSpent = new ArrayList<>();
        amountSpent.add(100);
        amountSpent.add(500);
        amountSpent.add(0);
        amountSpent.add(300);
        List<String> aList = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
        List<String> bList = new ArrayList<>(Arrays.asList("C", "D"));
        List<String> cList = new ArrayList<>();
        cList.add("0");
        List<String> dList = new ArrayList<>(Arrays.asList("A", "B"));
        List<List<String>> listOfFriends = new ArrayList<>(Arrays.asList(aList, bList, cList, dList));
        List<Friend> friendList = new LinkedList<>();
        for (int initial = 0; initial < numberOfFriends; initial++) {
            Friend friend = new Friend(friendName.get(initial), amountSpent.get(initial), listOfFriends.get(initial));
            friendList.add(friend);
        }
        System.out.println(friendList);
        Expenditure expenditure = new Expenditure();
        expenditure.calculate(friendList);
        List<String> actual = new ArrayList<>(Expenditure.resultList);
        List<String> expected = new ArrayList<>(Arrays.asList("A gives 75", "B gets 325", "C gives 275", "D gets 25"));
        //Then
        Assertions.assertEquals(expected, actual);


    }

}

