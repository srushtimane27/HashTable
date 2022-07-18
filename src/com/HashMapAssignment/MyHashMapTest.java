package com.HashMapAssignment;
import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;

public class MyHashMapTest {
    public void givenASentenceWhenWordsAreAddedToListShouldReturnWordFrequency(){ //TestMethod
        String sentence = "To be or not to be";
        MyHashMap<String,Integer> myHashMap = new MyHashMap<>();    //key=String , value=Integer
        String[] words = sentence.toLowerCase().split(" ");
        for (String word : words) {
            Integer value = myHashMap.get(word);            //add key values get key values
            if (value == null) value = 1;
            else value = value + 1;
            myHashMap.add(word, value);
        }
        int frequency = myHashMap.get("to");
        System.out.println(myHashMap);
        Assert.assertEquals(2,frequency);
    }
}
