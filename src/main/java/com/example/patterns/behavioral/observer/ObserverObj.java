package com.example.patterns.behavioral.observer;

public class ObserverObj implements ClassObserver {

    private int observer_id;

    public ObserverObj(int id) {
        setId(id);
    }

    /* ---------------------------------------------------
     * -- Public methods
     * --------------------------------------------------- */

    /**
     * When the observer gets an update, it will post a message
     * on the standard out (stdout).
     */
    @Override
    public void update() {
        System.out.println("Observer " + observer_id + " got a ping to update");
    }

    /* ---------------------------------------------------
     * -- Private methods
     * --------------------------------------------------- */

    /**
     * Sets the observer id
     */
    private void setId(int value) {
        this.observer_id = value;
    }
}
