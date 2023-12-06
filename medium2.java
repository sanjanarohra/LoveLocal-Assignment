import java.util.ArrayList;
import java.util.List;

public class medium2 
{
    public static List<Integer> majorityElements(int[] arr) 
    {
        List<Integer> result = new ArrayList<>();

        int max_ele1 = 0, count1 = 0;
        int max_ele2 = 0, count2 = 0;

        //to find two elements of highest occurence
        for (int i : arr) {
            if (i == max_ele1) count1++;
            else if (i == max_ele2) count2++;
            else if (count1 == 0) 
            {
                max_ele1 = i;
                count1 = 1;
            } 
            else if (count2 == 0) 
            {
                max_ele2 = i;
                count2 = 1;
            } 
            else 
            {
                count1--;
                count2--;
            }
        }

        //counting the frequency of the two elements that have maximum occurence
        count1 = 0;
        count2 = 0;
        for (int i : arr) 
        {
            if (i == max_ele1) count1++;
            else if (i == max_ele2) count2++;
        }

        //Checking if the two elements appear more than ⌊ n/3 ⌋ times
        int n = arr.length;
        if (count1 > n / 3) result.add(max_ele1);
        if (count2 > n / 3) result.add(max_ele2);

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,2};
        List<Integer> result = majorityElements(arr);
        System.out.println("Elements appearing more than ⌊ n/3 ⌋ times: " + result);
    }
}
