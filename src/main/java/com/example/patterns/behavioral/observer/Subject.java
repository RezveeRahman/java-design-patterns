package com.example.patterns.behavioral.observer;

import java.util.ArrayList;

public class Subject implements ClassSubject {

    /**
     * Contains the list of observers
     */
    private ArrayList<ObserverObj> listeners = new ArrayList<>();

    /* ---------------------------------------------------------- *
     * -- Public methods
     * ----------------------------------------------------------- */

    /**
     * Adds specified Observer to the list
     * @param o
     */
    @Override
    public void registerObserver(ObserverObj o) {
        System.out.println("Adding observer " + o);
        listeners.add(o);
    }

    /**
     * Removes specified Observer to the list
     */
    @Override
    public void removeObserver(ObserverObj o) {
        System.out.println("Removing observer " + o);
        listeners.remove(o);
    }

    /**
     * Notifies listeners that are on the array list
     */
    @Override
    public void notifyListeners() {
        for (ObserverObj o : listeners) {
            o.update();
        }
    }

}
