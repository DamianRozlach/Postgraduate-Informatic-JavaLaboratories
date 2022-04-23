package pl.edu.agh.asd3.map;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    Map<String, String> map = new HashMap<>();

    public void addEntry(String name, String phoneNumber) {
        //TODO
    	this.map.put(name, phoneNumber);
    }

    public String findEntry(String name) {
        //TODO
        return this.map.get(name);
    }

    public boolean existsEntry(String name) {
        //TODO
        return this.map.containsKey(name);
    }

    public boolean checkNumberExists(String phoneNumber) {
        //TODO
        return this.map.containsValue(phoneNumber);
    }
}
