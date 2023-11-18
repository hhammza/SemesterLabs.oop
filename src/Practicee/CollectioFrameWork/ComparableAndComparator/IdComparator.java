package Practicee.CollectioFrameWork.ComparableAndComparator;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class IdComparator implements Comparator<Emp> {
    @Override
    public int compare(Emp o1, Emp o2) {
        return o1.getId()-o2.getId();
    }


//    @Override
//    public Comparator reversed() {
//        return Comparator.super.reversed();
//    }
//
//    @Override
//    public Comparator thenComparing(Comparator other) {
//        return Comparator.super.thenComparing(other);
//    }
//
//    @Override
//    public Comparator thenComparingInt(ToIntFunction keyExtractor) {
//        return Comparator.super.thenComparingInt(keyExtractor);
//    }
//
//    @Override
//    public Comparator thenComparingLong(ToLongFunction keyExtractor) {
//        return Comparator.super.thenComparingLong(keyExtractor);
//    }
//
//    @Override
//    public Comparator thenComparingDouble(ToDoubleFunction keyExtractor) {
//        return Comparator.super.thenComparingDouble(keyExtractor);
//    }
//
//    @Override
//    public Comparator thenComparing(Function keyExtractor) {
//        return Comparator.super.thenComparing(keyExtractor);
//    }
//
//    @Override
//    public Comparator thenComparing(Function keyExtractor, Comparator keyComparator) {
//        return Comparator.super.thenComparing(keyExtractor, keyComparator);
//    }
}
