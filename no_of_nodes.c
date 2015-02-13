//////////Number of nodes in a binary tree////////////
//int count;
int no_of_nodes(Node *root){
	if(root==null){
		return 0;
	}
	return 1+no_of_nodes(root->left)+no_of_nodes(root->right);
}