package data.structures.examples;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/*
 * Basic implementation of a TreeMap
 * TreeMap extends the AbstractMap class and implements the Map, NavigableMap and SortedMap interfaces
 */

public class TreeMapExample {

    public static void main(String[] args) {

        Map<Integer,String> myMap = new TreeMap<>();

        myMap.put(2, "30");
        myMap.put(1, "1");
        myMap.put(7, "4");

        System.out.println(myMap);

        /*
         * It constructs a new treemap ordered according to the given comparator.
         */

        myMap = new TreeMap<>((x, y) -> (x > y) ? -1 : ((x == y) ? 0 : 1));
        myMap.put(2, "30");
        myMap.put(1, "1");
        myMap.put(7, "4");
        System.out.println(myMap);

        /*
         * It constructs a new treemap by implementing the SortedMap interface
         */

        SortedMap anotherMap = new TreeMap();
        anotherMap.put(8, "11");
        anotherMap.put(111, "51");
        anotherMap.put(2, "2");

        Comparator comparator = new MyComparator();
        System.out.println(comparator.compare(anotherMap.get(8), anotherMap.get(111)));


    }

    /*
     * Very primitive overridden compare method
     */
    private static class MyComparator implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            if( o1.equals(o2)){
                return 0;
            }
            else{
                return 1;
            }
        }
    }
}
