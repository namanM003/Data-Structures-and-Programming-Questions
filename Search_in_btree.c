////////////////////////Searching in a btree/////////////////////////////////////////
boolean findnode(TreeNode *root,int val){
	if(root==null){
		return false;
	}
	if(root->val==val){
		return true;
	}
	return (findnode(root->left,val) || findnode(root->right,val));
}