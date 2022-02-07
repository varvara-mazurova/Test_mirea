package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ведите место в сейфе: ");
        int volume_of_bag = sc.nextInt();
        System.out.print("Ведите количество предметов: ");
        int amount_of_elements = sc.nextInt();
        ArrayList<String> all_alements = new ArrayList<>();
        ArrayList<Integer>all_specifications = new ArrayList<>();
        ArrayList<Integer>all_volume = new ArrayList<>();
        int count = 0;
        HashMap<Integer, String> map = new HashMap<>();
        HashMap<Integer, String> sortedMap = new HashMap<>();

        for(int i = 0; i < amount_of_elements; i++){
            System.out.print("Ведите предмет: ");
            String item = sc.next();
            System.out.print("Ведите вес предмета: ");
            int volume = sc.nextInt();
            System.out.print("Ведите ценность предмета: ");
            int value = sc.nextInt();
            if(volume > volume_of_bag){
                continue;
            }
            all_alements.add(i, item);
            all_volume.add(i, volume);
            all_specifications.add(count, volume);
            count++;
            all_specifications.add(count, value);
            count++;
        }
        count = 0;
        for(int i = 0; i < all_alements.size(); i++){
            int multiplication = all_specifications.get(count) * all_specifications.get(count+1);
            count+=2;
            map.put(multiplication, all_alements.get(i));
        }
        sortedMap = map.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .collect(Collectors
                        .toMap(Map.Entry::getKey,
                                Map.Entry::getValue,
                                (e1, e2) -> e1,
                                LinkedHashMap::new));
        int flag = 0;
        System.out.print("В сейфе находятся: ");
        for(Integer key: sortedMap.keySet()){
            String value = sortedMap.get(key);
            for(int k = 0; k < all_alements.size(); k++){
                if(value.equals(all_alements.get(k)) && volume_of_bag >= all_volume.get(k)){
                    volume_of_bag-=all_volume.get(k);
                    flag = 1;
                    System.out.print(all_alements.get(k) + " ");
                }
            }
        }
        if(flag == 0){
            System.out.print("нет предметов");
        }
    }
}