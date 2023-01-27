package recapeByDays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Day16 {
	
	 public static void main(String[] args) {
		 
//		 ArrayList inf = new ArrayList();
//		 inf.add(1);
//		 inf.add("Shir");
//		 inf.add("Law");
//		 System.out.println(inf);
//		 inf.remove(1);
//		 System.out.println(inf);
		 
//       ArrayList bioData = new ArrayList();
//       bioData.add(1);
//       bioData.add("Ahmad");
//       bioData.add("Khan");
//       bioData.add(23);
//       
//       System.out.println(bioData);
//---------------------------------
         // Map    key:value pairs
//		 --- By me
//		 HashMap  bioD = new HashMap();
//		 bioD.put("One", "Shagul");
//		 bioD.put(4,"ShirShah");
//		 bioD.put("Zero", "Shir");
//		 bioD.put(2,"Shah");
//		 System.out.println(bioD);
////		 bioD.clear();
//		 bioD.remove(3);
//		 
//		 System.out.println(bioD);
		 
//         HashMap<String,String> bioData1 = new HashMap();
//         bioData1.put("id", "1");
//         bioData1.put("name", "Ahmad");
//         bioData1.put("fname", "Khan");
//         bioData1.put("marks","23");
//         
//         System.out.println(bioData1);

           // Map Interface, key value pairs
           // no duplicate key
           // 1. HashMap
           // 2. LinkedHashMap
           // 3. TreeMap
           
//           HashMap<String,String> map = new HashMap();
////           // add
//           map.put("k1", "Ahmad");
//           map.put("k1", "Khan");
//           map.put("k2", "Khan");
//           
//           System.out.println(map);
           // putAll
//           HashMap<String,String> map1 = new HashMap();
//           map1.put("k3", "Jan");
//           map1.put("k1", "Ahmadi");
//           
//           map.putAll(map1);
//           System.out.println(map);
//           
//           
//           // equals
//           System.out.println(map.equals(map1));
//
//           // clear
////           map.clear();
////           System.out.println(map);
//
//
//           // isEmpty
//           System.out.println(map.isEmpty());
//
//           // update
////           map.replace("k2", "Khanoo");
////           System.out.println(map);
//
//           // remove
////           map.remove("k2"); // based key remove
////           System.out.println(map);
//
////           map.remove("k5");
////           System.out.println(map);
//           
//           // size
//           System.out.println(map.size());
//
//           // get all values
//           System.out.println(map.values());
//
//           // get all key
//           System.out.println(map.keySet());
//
//           // search for a value
//           System.out.println(map.containsKey("k6"));
//
//           System.out.println(map.containsValue("Khan"));
//
//           map.putIfAbsent("k4", "Janooo"); // .putIfAbsent use for adding new pair of (Key, Value) if the key is absent in the Map List/Set
//           map.putIfAbsent("k5", "Surwat");
//           
//           System.out.println(map);


           // loop through all map data
//             System.out.println(map.entrySet());
//             Set s = map.entrySet();
//             
//             Iterator x = s.iterator();
//             while(x.hasNext()){
//                 System.out.println(x.next());
////                    k1 = value
//                   Map.Entry y = (Map.Entry)x.next();
//                   System.out.println(y.getKey());
//                   System.out.println(y.getValue());
//             }


           // 1. HashMap
           // 2. LinkedHashMap
           // 3. TreeMap
           
//           HashMap<Integer,String> map = new HashMap();
//           map.put(1,"Ahmad");
//           map.put(2,"Khan");
//           map.put(3, null);
//           map.put(4, null);
//           map.put(null, null);
//           System.out.println(map);
           
           
//   It contains key-pair values.
//   It can not have duplicate keys.
//   It may have one null key and multiple null values.
//   It is non-synchronized.
//   It does not provide a way to maintain the order of elements.
//   The default capacity of the Java HashMap class is 16 with a load factor of 0.75.
//   Fast
           
//   LinkedHashMap<Integer,String> map1 = new LinkedHashMap();

//it stores the values in the key-pair combination.
//It can not have duplicate elements.
//It may have one null key and multiple null values.
//It is non synchronized.
//It provides an easy way to maintain the insertion order

           
   // TreeMap
       
//   Java TreeMap contains values based on the key. It implements the NavigableMap interface and extends AbstractMap class.
//   Java TreeMap contains only unique elements.
//   Java TreeMap cannot have a null key but can have multiple null values.
//   Java TreeMap is non synchronized.
//   Java TreeMap maintains ascending order.

       TreeMap map2 = new TreeMap();
         map2.put("k6", null);   // TreeMap not allow Null Key and allow Multiple Null Value
//       map2.put(null, "Khan");  // TreeMap not allow Null Key and allow Multiple Null Value
         map2.put("k2", "Ahmad");
         map2.put("k1", "Zabi");
         map2.put("k3", "Jan");
         map2.put("k4", "Khan");
         map2.put("k5", "Ahmad");
       System.out.println(map2);

       
       
   }
   
}



