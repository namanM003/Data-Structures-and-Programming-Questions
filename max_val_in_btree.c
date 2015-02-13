/////////////////Function to find max in a Binary tree////////////////////////
int findMax(Node *root){
	int val=root->val;
	int left=findMax(root->left);
	int right=findMax(root->right);
	int max;
	if(left>right){
		max=left;
	}
	else{
		max=right;
	}
	return max>val?max:val;
}