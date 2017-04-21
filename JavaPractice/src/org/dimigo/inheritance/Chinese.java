package org.dimigo.inheritance;

/**
 * Created by jrguy on 2017-04-21.
 */
/*
 * <pre>
 *  org.dimigo.inheritance
 *      |_ Korean
 *  1. 개요 :
 *  2. 작성일 : 2017-04-21
 *  </pre>
 *
 * @author : jrguy
 * @version : 1.0
*/
public class Chinese extends Person {
    public Chinese(String name) {
        super(name);
    }
    @Override
    public void sayHello(){
        System.out.println("니하오");
    }
    public void sayBye(){
        System.out.println("짜이찌엔");
    }

    @Override
    public String toString() {
        return "저는 중국사람 "+getName()+"입니다.";
    }
}
