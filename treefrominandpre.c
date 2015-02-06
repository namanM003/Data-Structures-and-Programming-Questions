#include <stdio.h>
#include <stdarg.h>
struct node{
	int value;
	struct node *left;
	struct node *right;
};
struct node *head;
int in_order[]={7,1,6,10,5,3,4};
int pre_order[]={10,1,7,6,3,5,4};
int static_pointer=-1;
struct node* construct_tree(int low,int high)
{
	static_pointer++;
	
	if(low==high)
	{
        struct node *new=malloc(sizeof(struct node));
        new->value=pre_order[static_pointer];
        new->left=NULL;
        new->right=NULL;
        return new;
	}
	else{
		struct node *new=malloc(sizeof(struct node));
		new->value=pre_order[static_pointer];
		int index=low;
		while(in_order[index]!=pre_order[static_pointer])
			index++;
		new->left=construct_tree(low,index-1);
		new->right=construct_tree(index+1,high);
		return new;
	}
		
	
	//struct node *new=malloc(sizeof(struct node));
	
	
	
}
void traverse(struct node *temp){
	if(temp==NULL)
		return;
	traverse(temp->left);
	traverse(temp->right);
	printf("%d\t",temp->value);
	
}
void main(){
	head=construct_tree(0,6);
	traverse(head);
}
