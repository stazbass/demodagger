package com.stz.dagger;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        final MainComponent mainComponent = DaggerMainComponent.create();
        System.out.println( "Hello World!" );
        Arrays.asList("a", "b", "c").forEach(s->{
            System.out.println( s + " " + mainComponent.createUser());
        }
        );
        System.out.println("end");
    }
}
