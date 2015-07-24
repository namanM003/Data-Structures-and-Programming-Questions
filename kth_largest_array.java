/*Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order, not the kth distinct element.

For example,
Given [3,2,1,5,6,4] and k = 2, return 5.

Note:
You may assume k is always valid, 1 ≤ k ≤ array's length.*/ 
 public int findKthLargest(int[] nums, int k) {
        int[] min_heap = new int[k];
        if(nums.length < k){
            return 0;
        }
        Arrays.fill(min_heap,Integer.MIN_VALUE);
        /*for(int i=0;i<k;i++){
            min_heap[i] = nums[i];
            min_heap = minify(min_heap);
            
            
        }*/
        //min_heap = minify(min_heap);
        for(int i=0;i<nums.length;i++){
            if(min_heap[0] < nums[i]){
                min_heap[0] = nums[i];
                min_heap = minify(min_heap);
            }
        }
        return min_heap[0];
        
    }
    public int[] minify(int[] heap){
        for(int i=0;i<heap.length/2;i++){
            int left_child = 2*i+1;
            int right_child = 2*i+2;
            if(right_child < heap.length){
                if(heap[i] > heap[left_child]){
                    int temp = heap[i];
                    heap[i] = heap[left_child];
                    heap[left_child] = temp;
                }
                if(heap[i] > heap[right_child]){
                    int temp = heap[i];
                    heap[i] = heap[right_child];
                    heap[right_child] = temp;
                }
            }
            else{
                if(left_child < heap.length){
                    if(heap[i] > heap[left_child]){
                        int temp = heap[i];
                        heap[i] = heap[left_child];
                        heap[left_child] = temp;
                    }
                }
            }
            
        }
        return heap;
    }
}