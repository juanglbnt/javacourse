package com.juan.designPatterns.Observer.observer;

import java.math.BigDecimal;

public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
    public void setBidAmount(Observer observer, BigDecimal bidAmount);
}
