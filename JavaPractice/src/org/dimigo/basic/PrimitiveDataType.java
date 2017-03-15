package org.dimigo.basic;

/**
 * Created by jrguy on 2017-03-09.
 */
/*
 * <pre>
 *  org.dimigo.basic
 *      |_ PrimitiveDataType
 *  1. 개요 : IU 프로필
 *  2. 작성일 : 2017-03-09
 *  </pre>
 *
 * @author : jrguy
 * @version : 1.0
*/
public class PrimitiveDataType {
    public static void main(String [] args)
    {
        String name = "아이유";
        boolean isMale = false;
        int age= 25;
        double height = 161.8;
        float weight = 44.3f;
        char bloodType = 'A';
        System.out.printf("<<IU 프로필>>\n이름 : %s\n성별 : %s\n나이 : %d\n키 : %.1f\n몸무게 : %.1f\n혈액형 : %c",name,(isMale)?"남성":"여성",age,height,weight,bloodType);
    }
}
