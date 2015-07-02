public class Solution {

    ArrayList<Integer> arr = new ArrayList<Integer>();

    public int kthSmallest(TreeNode root, int k) {

            if(root==null){

                return 0;

            }

            kthSmallest(root.left,k);

            arr.add(root.val);

            kthSmallest(root.right,k);

            if(arr.size()>=k){

                return arr.get(k-1);

            }

            else{

                return 0;

            }

        }

            

        

}
