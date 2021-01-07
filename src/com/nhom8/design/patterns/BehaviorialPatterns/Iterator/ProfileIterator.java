package com.nhom8.design.patterns.BehaviorialPatterns.Iterator;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}