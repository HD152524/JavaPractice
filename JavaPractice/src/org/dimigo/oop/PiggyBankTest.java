package org.dimigo.oop;

/**
 * Created by jrguy on 2017-04-18.
 */
/*
 * <pre>
 *  org.dimigo.oop
 *      |_ PiggyBankTest
 *  1. 개요 :
 *  2. 작성일 : 2017-04-18
 *  </pre>
 *
 * @author : jrguy
 * @version : 1.0
*/
public class PiggyBankTest {
    public static void main(String [] args){
        FamilyMember[] asdf={new FamilyMember("아빠"),new FamilyMember("엄마"),new FamilyMember("나"), new FamilyMember("남동생")};
        int[] qwer={10000,5000,2000,1000};
        FamilyMember.printMemberCnt();
        for(int i=0;i<asdf.length;i++)
            PiggyBank.pubMoney(asdf[i],qwer[i]);
        PiggyBank.printBalance();
        PiggyBank.pubMoney(asdf[2],1000);
        PiggyBank.printBalance();

    }
}
