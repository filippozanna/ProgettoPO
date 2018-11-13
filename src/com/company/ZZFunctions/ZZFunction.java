package com.company.ZZFunctions;

@FunctionalInterface
public interface ZZFunction<T,S> {
    S apply(T e);
}
