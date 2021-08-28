package com.example.diamondhotels;

import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class ListHelper {

    static ArrayList<String> users = new ArrayList<>();
    static ArrayList<String> pass= new ArrayList<>();

    public void addUser(String name,String password)
    {
        users.add(name);
        pass.add(password);
    }

    public Boolean searchUser(String name, String password)
    {
        for(int i=0;i<users.size();i++)
        {
            if(users.get(i).equals(name))
                return true;
        }
        return false;
    }
}
