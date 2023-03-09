package animals;

import java.util.Comparator;

public class WolfYearComparator implements Comparator<Wolf> {
    @Override
    public int compare(Wolf o1, Wolf o2) {
        if (o1.getYear() > o2.getYear()) {
            return 1;
        } else if (o1.getYear() < o2.getYear()) {
            return -1;
        }
        return 0;
    }
}
