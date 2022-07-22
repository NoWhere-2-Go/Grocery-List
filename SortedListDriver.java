public class SortedListDriver {
    public SortedListDriver() {
    }

    public static void main(String[] args) {
        SortedListArrayBased myGroceryList = new SortedListArrayBased();
        myGroceryList.add("milk");
        myGroceryList.add("eggs");
        myGroceryList.add("butter");
        myGroceryList.add("pecans");
        myGroceryList.add("apples");
        myGroceryList.add("bread");
        myGroceryList.add("chicken");
        myGroceryList.add("black beans");
        myGroceryList.add("rice");
        myGroceryList.add("sausage");
        myGroceryList.add("flour");
        printList(myGroceryList);
        System.out.print("numItems is now: " + myGroceryList.size() + "\n\n");
        adding(myGroceryList, "juice");
        removing(myGroceryList, "juice");
        adding(myGroceryList, "banana");
        removing(myGroceryList, "sausage");
        removing(myGroceryList, "cheese");
        System.out.println("main(String[] args) is called...");
    }

    public static void adding(SortedListArrayBased myList, String str) {
        System.out.println("Adding " + str + " ...");
        myList.add(str);
        printList(myList);
        System.out.print("numItems is now: " + myList.size() + "\n\n");
    }

    public static void removing(SortedListArrayBased myList, String str) {
        System.out.println("Removing " + str + " ...");
        myList.remove(str);
        printList(myList);
        System.out.print("numItems is now: " + myList.size() + "\n\n");
    }

    public static void printList(SortedListArrayBased myList) {
        for(int index = 0; index < myList.size(); ++index) {
            System.out.printf("%2d. %s\n", index + 1, (String)myList.get(index));
        }

    }
}
