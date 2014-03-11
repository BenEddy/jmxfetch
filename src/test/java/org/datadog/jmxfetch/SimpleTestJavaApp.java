package org.datadog.jmxfetch;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class SimpleTestJavaApp implements SimpleTestJavaAppMBean {

    private int should_be_100 = 100;
    private int should_be_1000 = 1000;
    private int should_be_counter = 0;
    private HashMap<String, Integer> hashmap = new HashMap<String, Integer>();;
    private AtomicInteger atomic42 = new AtomicInteger(42);
    private AtomicLong atomic4242 = new AtomicLong(4242);
    private Object object1337 = new Double(13.37);
   
    SimpleTestJavaApp() {
        hashmap.put("thisis0", 0);
        hashmap.put("thisis10", 10);
        hashmap.put("thisiscounter", 0);
    }
    public int getShouldBe100() {
        return should_be_100;
    }

    public Double getShouldBe1000() {
        return Double.valueOf(should_be_1000);
    }
    
    public int getShouldBeCounter() {
        return should_be_counter;
    }
    
    public void incrementCounter(int inc) {
        should_be_counter += inc;
    }
    
    public void incrementHashMapCounter(int inc) {
        hashmap.put("thisiscounter", hashmap.get("thisiscounter") + inc);
    }

    public HashMap<String, Integer> getHashmap() {
        return hashmap;
    }
    public AtomicInteger getAtomic42() {
        return atomic42;
    }
    public AtomicLong getAtomic4242() {
        return atomic4242;
    }
    public Object getObject1337() {
        return object1337;
    }

    
}
    