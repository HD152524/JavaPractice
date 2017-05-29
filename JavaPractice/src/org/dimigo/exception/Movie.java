package org.dimigo.exception;

/**
 * Created by pc on 2017-05-29.
 */
public class Movie {
    private String title;
    private int limitAge;

    public Movie(String title, int limitAge) {
        this.title = title;
        this.limitAge = limitAge;
    }

    public String getTitle() {
        return title;
    }

    public int getLimitAge() {
        return limitAge;
    }

    public void buyTicket(int age){
        if (age<limitAge){
            try {
                throw new AgeCheckException(this);
            }
            catch(AgeCheckException e)
            {
                System.out.println(e.getMessage());
            }
        }
        else {
            System.out.println(getTitle()+" 잘 보세요");
        }
    }
}
