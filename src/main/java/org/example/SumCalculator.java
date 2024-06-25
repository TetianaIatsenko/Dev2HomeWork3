package org.example;

import java.util.stream.IntStream;

public class SumCalculator {
    public int sum(int n){
        if( n<=0 )
            throw new IllegalArgumentException("Argument must be positive");
        IntStream.range(0, n+1).forEach(s -> System.out.println(s));
        return IntStream.range(0, n + 1).sum();
    }
}
