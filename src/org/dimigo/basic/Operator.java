package org.dimigo.basic;

/**
 * Created by jrguy on 2017-03-14.
 */
/*
 * <pre>
 *  org.dimigo.basic
 *      |_ Operator
 *  1. 개요 :
 *  2. 작성일 : 2017-03-14
 *  </pre>
 *
 * @author : jrguy
 * @version : 1.0
*/
public class Operator {
    public static void main(String [] args)
    {
        long a=1700000,b=3,c=1500;
        System.out.printf("<< 디미베네 연간 인건비 >>\n월 평균 급여 : "+String.format("%,d",a)+"원\n점포 내 직원 수 : %d명\n점포 수 : %s개",b,String.format("%,d",c));
        System.out.printf("\n\n\n연간 인건비 : %s원",String.format("%,d",a*b*c*12));
    }
}
