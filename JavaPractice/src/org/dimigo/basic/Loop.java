package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by jrguy on 2017-03-16.
 */
/*
 * <pre>
 *  org.dimigo.basic
 *      |_ Loop
 *  1. 개요 :
 *  2. 작성일 : 2017-03-16
 *  </pre>
 *
 * @author : jrguy
 * @version : 1.0
*/
public class Loop {
    public static void main(String [] args){
        int input,strength=100;
        String[] jobs= {"마법사", "영주","기사","농민"};
        do{
            System.out.printf("-----------\n<< 게임 메뉴 >>\n1. 공격력 증가\n2. 공격력 감소\n3. 캐릭터 설정\n9. 종료\n-------------\n메뉴 입력 => ");
            Scanner scanner = new Scanner(System.in);
            input=scanner.nextInt();
            switch(input){
                case 1:
                    System.out.println("공격력이 증가되었습니다. 현재 공격력 : "+(strength+=10));
                    break;
                case 2:
                    System.out.println("공격력이 감소되었습니다. 현재 공격력 : "+(strength-=10));
                    break;
                case 3:
                    System.out.println(jobs[new Random().nextInt(jobs.length)]+"(으)로 설정되었습니다.");
                    break;
                default:
                    if(input!=9)
                        System.out.println("없는 메뉴입니다!!");
            }
        }while(input!=9);
        System.out.println("이제 공부하세요!");
    }
}
