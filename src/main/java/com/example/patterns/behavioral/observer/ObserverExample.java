package com.example.patterns.behavioral.observer;

public class ObserverExample {

    private static Subject sbj = new Subject();

    private static ObserverObj obs1 = new ObserverObj(0);
    private static ObserverObj obs2 = new ObserverObj(0);
    private static ObserverObj obs3 = new ObserverObj(0);

    public static void executeObserver() {
        addObservers();
        update();
        removeObservers();
    }

    private static void addObservers() {
        sbj.registerObserver(obs1);
        sbj.registerObserver(obs2);
        sbj.registerObserver(obs3);
    }

    private static void update() {
        sbj.notifyListeners();
    }

    private static void removeObservers() {
        sbj.removeObserver(obs1);
        sbj.removeObserver(obs2);
        sbj.removeObserver(obs3);
    }

}
