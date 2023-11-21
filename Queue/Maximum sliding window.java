tc - n×k

  static void printKMax(int arr[], int N, int K)
    {
        int j, max;
 
        for (int i = 0; i <= N - K; i++) {
 
            max = arr[i];
 
            for (j = 1; j < K; j++) {
                if (arr[i + j] > max)
                    max = arr[i + j];
            }
            System.out.print(max + " ");
        }
    }

//2nd approach
//PriorityQueue
// tc -nlogk
public class Main {
    public static List<Integer> maxSlidingWindow(int[] arr,int k)
    {
        List<Integer> ans = new ArrayList<>();
        PriorityQueue<Pair> heap = new PriorityQueue<>(
            (a, b) -> b.value - a.value);
 
        // Initialize the heap with the first k elements
        for (int i = 0; i < k; i++) {
            heap.offer(new Pair(arr[i], i));
        }
 
        // The maximum element in the first window
        ans.add(heap.peek().value);
 
        // Process the remaining elements
        for (int i = k; i < arr.length; i++) {
            heap.offer(new Pair(arr[i], i));
 
            // Remove elements that are outside the current
            // window
            while (heap.peek().index <= i - k) {
                heap.poll();
            }
 
            // The maximum element in the current window
            ans.add(heap.peek().value);
        }
 
        return ans;
    }

//3rd approach
//dequeue
// tc- o(N)


public class SlidingWindow {
 
    static void printMax(int arr[], int N, int K)
    {
 
        // Create a Double Ended Queue, Qi
        // that will store indexes of array elements
        // The queue will store indexes of
        // useful elements in every window and it will
        // maintain decreasing order of values
        // from front to rear in Qi, i.e.,
        // arr[Qi.front[]] to arr[Qi.rear()]
        // are sorted in decreasing order
        Deque<Integer> Qi = new LinkedList<Integer>();
 
        /* Process first k (or first window)
        elements of array */
        int i;
        for (i = 0; i < K; ++i) {
 
            // For every element, the previous
            // smaller elements are useless so
            // remove them from Qi
            while (!Qi.isEmpty()
                   && arr[i] >= arr[Qi.peekLast()])
 
                // Remove from rear
                Qi.removeLast();
 
            // Add new element at rear of queue
            Qi.addLast(i);
        }
 
        // Process rest of the elements,
        // i.e., from arr[k] to arr[n-1]
        for (; i < N; ++i) {
 
            // The element at the front of the
            // queue is the largest element of
            // previous window, so print it
            System.out.print(arr[Qi.peek()] + " ");
 
            // Remove the elements which
            // are out of this window
            while ((!Qi.isEmpty()) && Qi.peek() <= i - K)
                Qi.removeFirst();
 
            // Remove all elements smaller
            // than the currently
            // being added element (remove
            // useless elements)
            while ((!Qi.isEmpty())
                   && arr[i] >= arr[Qi.peekLast()])
                Qi.removeLast();
 
            // Add current element at the rear of Qi
            Qi.addLast(i);
        }
 
        // Print the maximum element of last window
        System.out.print(arr[Qi.peek()]);
    }
