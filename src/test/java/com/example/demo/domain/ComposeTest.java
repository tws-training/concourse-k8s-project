package com.example.demo.domain;

import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ComposeTest {
    @Test
    public void should_return_empty_when_given_empty_string() {
        List<String> result = Compose.of("");
        assertEquals(0, result.size());
    }
    @Test
    public void should_return_a_when_given_one_string() {
        List<String> result = Compose.of("a");
        ArrayList<String> list=new ArrayList<>();
        list.add("a");
        assertEquals(list, result);
    }

    @Test
    public void should_return_ab_ba_when_given_ab() {
        List<String> result = Compose.of("ab");
        ArrayList<String> list=new ArrayList<>();
        list.add("ab");
        list.add("ba");
        assertEquals(list, result);
    }

    @Test
    public void should_return_list_has_6_elements_when_given_abc() {
        List<String> result = Compose.of("abc");
        ArrayList<String> list=new ArrayList<>();
        list.add("abc");
        list.add("acb");
        list.add("bac");
        list.add("bca");
        list.add("cab");
        list.add("cba");
        assertEquals(list, result);
    }

}
