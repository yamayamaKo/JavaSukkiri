package _16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class _16_practice {
    public static void main(String[] args) {
        Hero saitoh = new Hero("saitoh");
        Hero suzuki = new Hero("suzuki");

        ArrayList<Hero> heroList = new ArrayList<>();
        heroList.add(saitoh);
        heroList.add(suzuki);

        for (Hero hero: heroList){
            System.out.println(hero.getName());
        }

        Map<Hero, Integer> map = new HashMap<>();
        map.put(saitoh, 3);
        map.put(suzuki, 7);

        for(Hero hero: map.keySet()){
            System.out.println(hero.getName() + "が倒した敵の数は" + map.get(hero) + "です");
        }
    }
}
