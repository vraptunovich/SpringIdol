package com.springinaction.springidol.magicBox;

import org.springframework.beans.factory.support.MethodReplacer;

public class TigerReplacer implements MethodReplacer {

       @Override
    public Object reimplement(Object obj, java.lang.reflect.Method method, Object[] args) throws Throwable {
        return "A ferocious tiger"; // Помещает тигра в ящик
    }
}