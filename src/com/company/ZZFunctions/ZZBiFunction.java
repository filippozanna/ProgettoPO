package com.company.ZZFunctions;

@FunctionalInterface
public interface ZZBiFunction<S,T,Z> {
    S apply(T t, Z z);
}
