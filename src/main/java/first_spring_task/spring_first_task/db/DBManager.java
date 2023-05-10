package first_spring_task.spring_first_task.db;

import java.util.ArrayList;

public class DBManager {

    private static Long id = 5L;

    private static ArrayList<Item> items = new ArrayList<>();

    static {
        items.add(new Item(1L, "Phone", "This is mobile phone", 345000.00));
        items.add(new Item(2L, "IPhone", "This is mobile phone", 345000.00));
        items.add(new Item(3L, "Samsung", "This is mobile phone", 345000.00));
        items.add(new Item(4L, "Xiaomi", "This is mobile phone", 345000.00));
    }

    public static ArrayList<Item> getItems(){
        return items;
    }

    public static void AddItem(Item item){
        item.setId(id);
        items.add(item);
        id++;
    }
    public static Item getItem(Long id){
        for(Item it : items){
            if(it.getId() == id){
                return it;
            }
        }
        return null;
    }
}
