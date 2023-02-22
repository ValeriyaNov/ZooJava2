package Animals;

import java.util.ArrayList;
import java.util.Iterator;

public class WolfIterator implements Iterator {
    private ArrayList<Wolf> wolfs;
    private int cursor;

    public WolfIterator(ArrayList<Wolf> wolfs) {
        this.wolfs = wolfs;
    }

    @Override
    public boolean hasNext() {
        return cursor < wolfs.size();
    }

    @Override
    public Wolf next() {
        return wolfs.get(cursor++);
    }
}
