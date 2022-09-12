package se.aman;

import java.util.ArrayList;
import java.util.List;

public class Shelf {

        private List<String> items = new ArrayList<>();

        public List<Shelf> put(String item) {
            if(item != null && !item.isEmpty()) {
                this.items.add(item);
            }
            return null;
        }

        public boolean take(String item) {
            if(items.contains(item)) {
                items.remove(item);
                return true;
            }

            return false;
        }

}
