package todo.ui;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class ItemList extends ArrayList<String> {

    public ItemList() {
        add("Item 111");
        add("Item 222");
        add("Item 333");
    }
}
