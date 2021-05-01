package com.company;
public class UserManager
{

    public void add(User user) {
        System.out.println(user.getName()+" adli kullanici sisteme kaydedildi");
    }

    public void addMultiple(User[] users) {
        for (User user : users) {
            add(user);
        }
    }
}
