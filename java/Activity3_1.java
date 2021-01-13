import java.util.ArrayList;
public class Activity3_1 {
	
	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<String>();
	 myList.add("Banana");
     myList.add("Orange");
     myList.add("Grapes");
     myList.add("Orange");
     myList.add("Papaya");
     System.out.println("Print All the Objects in ArrayList:");
     for(String s:myList){
     System.out.println(s);
     }
     System.out.println("3rd element in the list is: " + myList.get(2));
     System.out.println("Is Chicku is in list: " + myList.contains("Chicku"));
     System.out.println("Size of ArrayList: " + myList.size()); 
     
     System.out.println("Removing "+myList.get(3)+" from List");
     myList.remove(3);
     
     System.out.println("New Size of ArrayList: " + myList.size());
     for(String s:myList){
         System.out.println(s);
         }
     System.out.println("Altering papaya with Bhavana");
     myList.set(3,"Bhavana");
     for(String s:myList){
         System.out.println(s);
         }
	}
}
