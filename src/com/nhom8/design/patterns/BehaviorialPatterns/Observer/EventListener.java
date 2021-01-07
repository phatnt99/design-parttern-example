package com.nhom8.design.patterns.BehaviorialPatterns.Observer;

import java.io.File;

public interface EventListener {
    void update(String eventType, File file);
}
