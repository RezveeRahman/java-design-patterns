package com.example.patterns.behavioral.observer;

public interface ClassSubject {

    /* ----------------------------------------
     * -- Public methods
     * ---------------------------------------- */
    public void registerObserver(ObserverObj o);

    public void removeObserver(ObserverObj o);

    public void notifyListeners();
}
