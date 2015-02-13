/////////////////////height of a tree////////////////
int height(TreeNode *root){
	if(root==null){
		return 0;
	}
	int left=1+height(root->left);
	int right=1+height(root->right);
	if(left>right){
		return left;
	}
	else{
		return right;
	}
}