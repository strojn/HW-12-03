package org.example;

import org.example.lambda_calculator.Operation;

public class Main {
    public static void main(String[] args)
    {
//        Operation add = (x, y) -> x + y;
        Operation mult = (x, y) -> x * y;
        Operation div = (x, y) -> x / y;
        Operation sub = (x, y) -> x - y;
        Operation pow = (x, y) -> Math.pow(x, y);//(value, powValue)
        Operation root = (x, y) -> Math.pow( x, (1/y) );//(value, y=rootValue)

        System.out.println( mult.calculate(3, 5) );
        System.out.println( div.calculate(3, 5) );
        System.out.println( sub.calculate(3, 5) );
        System.out.println( pow.calculate(3, 5) );
        System.out.println( root.calculate(27, 3) );
    }
}