import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of numbers, separated by spaces: ");
        String numSpace = scanner.nextLine();
        String temp = new String();
        int[] unSort = new int[numSpace.length()];
        int j = 0;
        for (int i = 0; i < numSpace.length(); i++)
        {
            if (numSpace.charAt(i)!=' ')
                temp += numSpace.charAt(i);
            if (numSpace.charAt(i)==' '){
                unSort[j] = Integer.parseInt(temp);
                System.out.print(unSort[j] + " ");
                j++;
                temp = "";
            }
            if(i == numSpace.length() - 1)
            {
                unSort[j] = Integer.parseInt(temp);
                System.out.print(unSort[j] + " ");
                j++;
                temp = "";
            }
        }
        int[] theSort = filterEvenNumbers(unSort);
        System.out.print("The even numbers are ");
        for(int k = 0; k < theSort.length;k++)
        {
            System.out.print(theSort[k] + " ");
        }
    }
    public static int[] filterEvenNumbers(int[] unSort)
    {
        int[] theSort = new int[unSort.length];
        int l = 0;
        for(int k = 0; k < unSort.length;k++)
        {
            if(unSort[k] % 2 == 0 && unSort[k] != 0)
            {
                theSort[l] = unSort[k];
                l++;
            }
        }
        int[] theSorted = new int[l];
        for(int k = 0; k < l;k++)
        {
            theSorted[k] = theSort[k];
        }
        return theSorted;
    }
}