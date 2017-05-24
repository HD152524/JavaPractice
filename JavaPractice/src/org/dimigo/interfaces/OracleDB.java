package org.dimigo.interfaces;

/**
 * Created by pc on 2017-05-24.
 */
public class OracleDB implements IDBManager {
    public void insert(){
        System.out.println("Oracle DB 저장");
    }
    public void search(){
        System.out.println("Oracle DB 조회");
    }
    public void update(){
        System.out.println("Oracle DB 변경");
    }
    public void delete(){
        System.out.println("Oracle DB 삭제");
    }
}
