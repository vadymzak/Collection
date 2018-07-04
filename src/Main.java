import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {
    public static  List<Car> cars = new ArrayList <>();
    public static void main(String[] args) {

        cars.add(new Car("Toyota", 1989));
        cars.add(new Car("Opel", 2000));
        cars.add(new Car("Nissan", 1985));
        cars.add(new Car("Niva", 1995));

       /* Comparator<Car> carComparator = new CarNameComparator();
        Collections.sort(cars, carComparator);
        print(cars);

        TreeSet <Car> carSet = new TreeSet <>(new CarYearComparator());

        carSet.add(new Car("Toyota", 1989));
        carSet.add(new Car("Opel", 2000));
        carSet.add(new Car("Nissan", 1985));
        carSet.add(new Car("Niva", 1995));

        print(carSet);*/
        /*Deque <Car> carsQueue = new ArrayDeque <>();
        carsQueue .add(new Car("Toyota", 1989));
        carsQueue .add(new Car("Opel", 2000));
        carsQueue .add(new Car("Nissan", 1985));
        carsQueue .add(new Car("Niva", 1995));
        carsQueue .add(new Car("Tavria", 1992));
        carsQueue .add(new Car("Audi", 1995));
        System.out.println(carsQueue.size());
        print(carsQueue);*/
        testMap();
    }

    public static void print(Collection p){
        Iterator<Car> iterator = p.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void testMap() {
        Map <String, Car> hashMap = new HashMap <>();

        hashMap.put("test", new Car("Niva", 1995));
        hashMap.put("key", new Car("Nissan", 1990));
        hashMap.put("toyota", new Car("Toyota", 2000));
        hashMap.put("car", new Car("Lexus", 2005));

        iterateMap(hashMap);

        Map <String, Car> treeMap = new TreeMap <>();

        treeMap.put("test", new Car("Niva", 1995));
        treeMap.put("key", new Car("Nissan", 1990));
        treeMap.put("toyota", new Car("Toyota", 2000));
        treeMap.put("car", new Car("Lexus", 2005));

        iterateMap(treeMap);

       /* Map <String, Car> linkedHashMap = new LinkedHashMap <>();

        linkedHashMap.put("test", new Car("Niva", 1995));
        linkedHashMap.put("key", new Car("Nissan", 1990));
        linkedHashMap.put("Toyota", new Car("Toyota", 2000));
        linkedHashMap.put("car", new Car("Lexus", 2005));

        iterateMap(linkedHashMap);*/
    }

    public static void iterateMap(Map map) {

        System.out.println();
        Iterator<Map.Entry<String, Car>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Car> carEntry = iterator.next();
            System.out.println(carEntry.getKey() + " " + carEntry.getValue());
        }
    }
}
