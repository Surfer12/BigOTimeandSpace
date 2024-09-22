package AssignmentLeetCodeLinkedList;



import java.util.LinkedList;



public class ReverseLinkedListWithLinkedListMethods {
   private LinkedList<Integer> aList = new LinkedList<Integer>();

   public ReverseLinkedListWithLinkedListMethods(LinkedList<Integer> aList) {
      this.aList = aList;
   }
   
   public void reverseList() {
   }
   
   public LinkedList<Integer> grabList() {
      return aList;
   }

   public void add(int index, Integer element) {
      aList.add(index, element);
   }

   public int size() {
      return aList.size();
   }

   public boolean isEmpty() {
      return aList.isEmpty();
   }

   public boolean add(Integer e) {
      return aList.add(e);
   }

   public Integer getIndex(int index) {
      return aList.remove(index);
   }

   public boolean canBeRemoved(Integer e) {
      return aList.remove(e);
   }
   
   public String toString() {
      return aList.toString();
   }
   
}
