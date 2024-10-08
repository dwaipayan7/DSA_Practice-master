

import java.util.Vector;

 static void printPairs(int arr[], int n)
{
    Vector<Integer> v = new Vector<Integer>();
    // For each element of array.
    for (int i = 0; i < n; i++)

        for (int j = i + 1; j < n; j++)

            if (Math.abs(arr[i]) == Math.abs(arr[j]))
                v.add(Math.abs(arr[i]));


    if (v.size() == 0)
        return;


    for (int i = 0; i < v.size(); i++)
        System.out.print(-v.get(i) + " " + v.get(i)
                + " ");
}

// Driver code
public static void main(String[] args)
{
    int arr[] = { 4, 8, 9, -4, 1, -1, -8, -9 };
    int n = arr.length;

    printPairs(arr, n);
}


