public class linearsearchdemo{
public staticint linearsearch(int[]arr,int target){
    for (int i=0;i<arr.length; i++){
        if(arr[i]==target){
            return i;

        }
    }
    return -1;
}
public static void main (string[] args){
    int[]number = {10,25,15,30,40};
    int target = 15;
    int result = linearsearch(numbers, target);
    if (result !=1);
    system.out.println("Element found in index", +result)
else
 system.out.println("element not found ");
}
}