package treemap;

import java.util.Comparator;
import java.util.function.Function;

public class Agecompare implements Comparator<Student1> {

    @Override
    public int compare(Student1 o1, Student1 o2) {
        return 0;
    }

    @Override
    public Comparator<Student1> reversed() {
        return Comparator.super.reversed();
    }

    @Override
    public Comparator<Student1> thenComparing(Comparator<? super Student1> other) {
        return Comparator.super.thenComparing(other);
    }

    @Override
    public <U> Comparator<Student1> thenComparing(Function<? super Student1, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
        return Comparator.super.thenComparing(keyExtractor, keyComparator);
    }
}
