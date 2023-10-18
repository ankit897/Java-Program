import java.util.*;
import java.util.Collections;

class Bucket{

    // JAVA program to perform bucket sorting
    // on array of size n
    static void bucketSort(float arr[], int n)
    {
        if (n <= 0)
            return;

        // 1) Create n empty buckets
        ArrayList<Float>[] buckets = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<>();
        }

        // 2) Put array elements in different buckets
        for (int i = 0; i < n; i++) {
            float idx = arr[i] * n;
            buckets[(int)idx].add(arr[i]);
        }

        // 3) Sort individual buckets
        for (int i = 0; i < n; i++) {
            Collections.sort(buckets[i]);
        }

        // 4) Gather all buckets together into array[]
        int arrayIndex = 0;
        for (int i = 0; i < n; i++) {
            int bucketSize = buckets[i].size();
            for (int k = 0; k < bucketSize; k++) {
                arr[arrayIndex ++] = buckets[i].get(k);
            }
        }
    }

    // Driver code
    public static void main(String args[])
    {
        float array[] = { (float)0.42, (float)0.32,
                (float)0.35, (float)0.52,
                (float)0.39, (float)0.47,
                (float)0.50};

        int n = array.length;
        bucketSort(array, n);

        System.out.println("Sorted Array is: ");
        for (float element : array) {
            System.out.print(element + " ");
        }
    }
}

