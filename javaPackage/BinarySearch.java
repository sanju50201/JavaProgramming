package JavaPackage;
public class BinarySearch{
    public static int data[] = {1,2,3,4,5};
    public static int binarySearch(int data[], int searchElement){
        int firstElement = 0;
        int lastElement = data.length-1;
        int middleElement = (firstElement+lastElement)/2;
        int position = -1;
        while(data[middleElement] <= searchElement){
            if(data[middleElement] < searchElement){
                firstElement = middleElement + 1;
            }else if(data[middleElement] == searchElement){
                middleElement = position;
                return position;
            }else{
                lastElement = middleElement - 1;
            }
        }
        return position;

    }
    public static void main(String[] args, int position) {
        binarySearch(data, 2);{
            if( 0 <= position){
                System.out.println("Element is found at: "+position);
            }else{
                System.out.println("Element not found.");
            }
        }

        
    }
}