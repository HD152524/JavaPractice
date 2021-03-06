package org.dimigo.io;

import java.io.*;

/**
 * Created by pc on 2017-06-14.
 */
public class ArakoMenu {
    public static void main(String[] args) {
        try(BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
            Writer writer = new BufferedWriter(new FileWriter("files/menu.txt"));
            BufferedReader reader = new BufferedReader(new FileReader("files/menu.txt"))
        )
        {
            String str;
            while((str=br.readLine())!=null){
                writer.write(str+"\n");
            }
            System.out.println("<< 메뉴 출력 >>");
            writer.flush();
            String line;
            while((line=reader.readLine())!=null){
                System.out.println(line);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
