package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by pc on 2017-06-05.
 */
public class MusicGenreChart {
    public static void main(String[] args) {
        Map<String, List<Music>> map = new HashMap<>();
        List<Music> ballade =  new ArrayList<>(), dance = new ArrayList<>();
        ballade.add(new Music("팔레트","아이유"));
        dance.add(new Music("I LUV IT", "PSY"));
        dance.add(new Music("맞지?","언니쓰"));
        map.put("발라드",ballade);
        map.put("댄스",  dance);
        printMap(map);
        System.out.println("\n-- << 댄스 2위 곡 변경 >> --");
        dance.set(1, new Music("SIGNAL","트와이스"));
        printMap(map);

        System.out.println("\n-- << 댄스 1위 곡 삭제 >> --");
        dance.remove(0);
        printMap(map);

        System.out.println("\n-- << 전체 리스트 삭제 >> --");

        dance.clear();
        ballade.clear();

        map.clear();
        printMap(map);
    }
    public static void printMap(Map<String, List<Music>> map){
        for(String tmp: map.keySet()){
            System.out.println("["+tmp+"]");
            int i=0;
            for(Music tmp2 :map.get(tmp)){
                System.out.println(++i+". "+tmp2);
            }
        }
    }
}
