package com.nhom8.design.patterns.CreationalPatterns.Singleton;

public class Main {

    public static void main(String[] args) {
        User a = new User("John");
        User b = new User("Doe");
        System.out.println(a.playAudio());
        System.out.println(b.playAudio());
    }
}

class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String playAudio() {
        return this.name + " " + Audio.getInstance().useAudio();
    }
}

class Audio {
    private static Audio _instance;
    private boolean status;

    public Audio() {
        this.status = true;
    }

    public boolean canUse() {
        return status;
    }

    public String useAudio() {
        if(!this.canUse()) {
            return "can not use Audio now!";
        }
        this.status = false;
        return "is being use Audio";
    }

    public static Audio getInstance() {
        if (_instance == null)
            _instance = new Audio();
        return _instance;
    }
}
