package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService <generic> {

    private final List<generic> genericList = new ArrayList<>();

    public void addValue(generic value) {
        genericList.add(value);
    }

    public generic first() {
        if (genericList.isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        return genericList.get(0);
    }

    public void print() {
        System.out.print("[");
        if (!genericList.isEmpty()) {
            System.out.print(genericList.get(0));
        }

        for (int i = 1; i < genericList.size(); i++) {
            System.out.print(", " + genericList.get(i));
        }
        System.out.println("]");
    }

}
