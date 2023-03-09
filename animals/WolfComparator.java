package animals;

import java.util.Comparator;

public class WolfComparator implements Comparator<Wolf> {

    public int compareTo(Wolf wolf1, Wolf wolf2) {
        //return (wolf1.getYear() - wolf2.getYear());
        if (wolf1.getYear() > wolf2.getYear()) {
            return 1;
        } else if (wolf1.getYear() < wolf2.getYear()) {
            return -1;
        } else return 0;

    }
    @Override
    public int compare(Wolf wolf1, Wolf wolf2) {
        if (wolf1.getWeight() == wolf2.getWeight()) {

            return compareTo(wolf1, wolf2);


        } else {
            if (wolf1.getWeight() > wolf2.getWeight()) {

                return 1;
            } else if (wolf1.getWeight() < wolf2.getWeight()) {
                return -1;
            } else return 0;
        }
    }
}
