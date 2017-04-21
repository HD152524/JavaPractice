package org.dimigo.inheritance;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by jrguy on 2017-04-21.
 */
/*
 * <pre>
 *  org.dimigo.inheritance
 *      |_ Person
 *  1. 개요 :
 *  2. 작성일 : 2017-04-21
 *  </pre>
 *
 * @author : jrguy
 * @version : 1.0
*/
public class Person {
    private String name;
    public Person(){

    }
    public Person(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "저는 "+name+"입니다.";
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    public void sayBye(){
        System.out.println("Bye");
    }
}
