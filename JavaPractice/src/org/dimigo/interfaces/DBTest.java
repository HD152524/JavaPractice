package org.dimigo.interfaces;

/**
 * Created by pc on 2017-05-24.
 */
public class DBTest {
    public static void main(String[] args) {
        System.out.println("<< 변경 전 >>");
        crud(IDBManager.getDBObject("SYBASE"));
        System.out.println("\n<< 변경 후 >>");
        crud(IDBManager.getDBObject("ORACLE"));
    }
    private static void crud(IDBManager db){
        db.insert();
        db.search();
        db.update();
        db.delete();
    }
}
