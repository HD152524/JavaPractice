package org.dimigo.interfaces;

/**
 * Created by pc on 2017-05-24.
 */
public interface IDBManager {
    public static final String ORACLE_DATABASE = "ORACLE";
    public static final String SYBASE_DATABASE = "SYBASE";
    void insert();
    void search();
    void update();
    void delete();
    static IDBManager getDBObject(String database){
        IDBManager out = null;
        if(database.equals(ORACLE_DATABASE))
            out = new OracleDB();
        else if(database.equals(SYBASE_DATABASE))
            out= new SybaseDB();
        return out;
    }
}
