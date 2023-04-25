package com.HashMapDemo.Example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        //HashMap contains data as Key,value pairs.
        //Contains only unique keys.
        //Not synchronized and not have an order
        //Java HashMap may have one null key and multiple null values
        HashMap<String, String> h1 = new HashMap<String, String>();
        h1.put("QA", "Ramana");
        h1.put("Devops", "Ruban");
        h1.put("Automation", "Ragavan");
        h1.put("Tester", "Rangan");
        h1.remove("QA");
        System.out.println(h1);
        Set<String> i = h1.keySet();
        for (String key : h1.keySet())
        {
            System.out.println(key + " -> " + h1.get(key));
        }
        Set s=h1.keySet();
        Iterator <String> I1= s.iterator();
        while(I1.hasNext())
        {
        	String key=I1.next();
        	System.out.println(key);
        	
        } 
    }
}

