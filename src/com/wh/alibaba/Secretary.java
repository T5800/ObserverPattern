package com.wh.alibaba;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: hijack
 * Date: 13-6-13
 * Time: 下午4:45
 * To change this template use File | Settings | File Templates.
 */
public class Secretary implements Notifier {

    private List<Observer> observerList = new ArrayList<Observer>(10);

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void add(Observer observer) {
        observerList.add(observer);
    }

    public void detach(Observer observer) {
        observerList.remove(observer);
    }

    public void Notify() {
        for (Observer observer : observerList) {
            observer.update(this.getState());
        }
    }
}
