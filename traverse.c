#include <stdio.h>
#include <stdarg.h>
void traverse(struct node *root){
	struct node *runner=root;
	if(runner->left==NULL){
		printf("%d",runner->data);
	}
	else{
	runner=runner->left;
	traverse(runner);
	}
	printf("%d",runner->data);
	if(runner->right==NULL){
	printf("%d",runner->right);
	}
	else{
	runner->runner->right;
	traverse(runner);
	}
}
