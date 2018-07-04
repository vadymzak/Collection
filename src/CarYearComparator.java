import java.util.Comparator;

public class CarYearComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        Integer a = o1.getYear();
        Integer b = o2.getYear();

        return  a.compareTo(b);
    }
}
