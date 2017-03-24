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
public class CarTest3 {
    public static void main(String [] args){
        Car3[] cars= new Car3[3];
        cars[0]=new Car3("현대자동차","제네시스","검정색",225,50000000);
        cars[1] = new Car3("기아자동차","K7","흰색",246);
        cars[2] = new Car3("삼성자동차","SM7","회색");

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
