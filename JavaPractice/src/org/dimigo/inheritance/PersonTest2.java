package org.dimigo.inheritance;

/**
 * Created by pc on 2017-05-10.
 */
public class PersonTest2 {
    private static void greeting(Person p){
        p.sayHello();
        p.sayBye();
    }
    public static void main(String args[]){

        Person[] p=new Person[]{
                new Person("Tom"),
                new Korean("홍길동"),
                new Japanese("다나카"),
                new Chinese("왕밍"),
        };
        for(int i=0;i<4;i++){
            System.out.println(p[i]);
            greeting(p[i]);
            System.out.println();
        }
    }
}
