package org.dimigo.oop;

import java.util.Scanner;

/**
 * Created by jrguy on 2017-03-31.
 */
/*
 * <pre>
 *  org.dimigo.oop
 *      |_ Question
 *  1. 개요 :
 *  2. 작성일 : 2017-03-31
 *  </pre>
 *
 * @author : jrguy
 * @version : 1.0
*/
public class Question {
    public static void main(String [] args)
    {
        String[] questions={"1. 가장 좋아하는 가수는?\n", "2. 가장 좋아하는 배우는?\n", "3. 가장 좋아하는 과목은?"};
        String[] answers={"서태지","없음","프로그래밍"};

        for(int i=0;i<questions.length;i++){
            System.out.println(questions[i]);
            Scanner input= new Scanner(System.in);
            System.out.println((answers[i].equals(input.next()))?"정답입니다!":"틀렸습니다!");
            }
            StringBuilder[] asdf= new StringBuilder[3];
        System.out.println("<< 결과 출력 >>");
        for(int i=0;i<asdf.length;i++){
            asdf[i]= new StringBuilder("가장 좋아하는 "+questions[i].substring(11,13)+"는? "+answers[i]+"입니다.");
            System.out.println(asdf[i]);
        }
    }
}
