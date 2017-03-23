package org.dimigo.oop;

/**
 * Created by jrguy on 2017-03-23.
 */
/*
 * <pre>
 *  org.dimigo.oop
 *      |_ CarTest
 *  1. 개요 :
 *  2. 작성일 : 2017-03-23
 *  </pre>
 *
 * @author : jrguy
 * @version : 1.0
*/
public class CarTest {
    public static void main(String [] args){

        Car[] cars= new Car[3];
        for(int i=0;i<3;i++)
            cars[i]=new Car();
        cars[0].setCompany("현대자동차");
        cars[0].setModel("제네시스");
        cars[0].setColor("검정색");
        cars[0].setMaxSpeed(225);
        cars[0].setPrice(50000000);
        cars[1].setCompany("기아자동차");
        cars[1].setModel("K7");
        cars[1].setColor("흰색");
        cars[1].setMaxSpeed(246);
        cars[1].setPrice(40000000);
        cars[2].setCompany("삼성자동차");
        cars[2].setModel("SM7");
        cars[2].setColor("회색");
        cars[2].setMaxSpeed(200);
        cars[2].setPrice(38000000);
        System.out.println("<< 자동차 목록 >>");
        for(int i=0;i<3;i++){
            System.out.println("제조사명 : "+cars[i].getCompany());
            System.out.println("모델명 : "+cars[i].getModel());
            System.out.println("색상 : "+cars[i].getColor());
            System.out.println("최대속도 : "+cars[i].getMaxSpeed()+"km");
            System.out.println("가격 : "+String.format("%,d",cars[i].getPrice())+"원\n");
        }
    }
}
