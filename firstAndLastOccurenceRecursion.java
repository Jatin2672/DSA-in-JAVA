import java.beans.IndexedPropertyChangeEvent;

public class firstAndLastOccurenceRecursion {
    public static int first=-1;
    public static int last=-1;

    public static void printOccurence(String str,int idx,char element){
        if(idx==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currentcharacter = str.charAt(idx);
        if(currentcharacter==element){
            if(first==-1){
                first=idx;
            }
            else{
                last=idx;
            }
        }
        printOccurence(str, idx+1, element);
    }
    public static void main(String args[]){
        String str="abaabsdbabbaad";
        printOccurence(str,0,'a');
    }
}
