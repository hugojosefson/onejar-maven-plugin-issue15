package com.mycompany.myapp;

import com.mycompany.myliba.LibA;
import com.mycompany.mylibc.LibC;
import com.mycompany.mylibb.LibB;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World from App!" );
        LibA.greet();
        LibB.greet();
        LibC.greet();

    }
}
