/////////////Printing a tree level order data in reverse/////////////////
void printing(TreeNode *root){
	if(root==null){
		return null;
	}
	printing(root->left);
	printing(root->right);
	printf("%d ",root->val);
}