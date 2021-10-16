package com.neu.edu;

import org.junit.Test;

public class HelloTest {
    @Test
    public void HelloTest(){
        Hello hello = new Hello();
        System.out.println(hello.toString()+"Hello Git");

        if(true){
            System.out.println("解决ISS52");
        }else{
            System.out.println("解决主干问题");
            System.out.println("解决主干问题");
        }


    }
}
