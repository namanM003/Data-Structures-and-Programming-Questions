//////////Deleting a tree/////////////
void delete(TreeNode *root){
	if(root==null){
		return;
	}
	delete(root->right);
	delete(root->left);
	free(root);
	return;
}