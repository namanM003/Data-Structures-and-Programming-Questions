/******************Program to add node in a a BST iteratively******************/////////
#include <stdio.h>
#include <stdarg.h>
struct node{
	int data;
	struct node *left;
	struct node *right;
};
void traverse(struct node*);
void main(){
	int i=0;
	struct node *new;
	struct node *root=malloc(sizeof(struct node));
	struct node *temp;//=malloc(sizeof(struct node));
	root->data=7;
	root->left=NULL;
	root->right=NULL;
	printf("Enter data for nodes\n");
	for(i=0;i<10;i++){
	new=root;
	int data1;
	scanf("%d",&data1);
	L1: if(new->data>data1){
			 if(new->left!=NULL){
			 	new=new->left;
			 	goto L1;
			 }
			 else
			 {
			 temp=malloc(sizeof(struct node));
			 //new=new->left;
			 temp->data=data1;
			 temp->left=NULL;
			 temp->right=NULL;
			 new->left=temp;
			 }
			 }
		else{
			if(new->right!=NULL){
				new=new->right;
				goto L1;
			}
			else{
			temp=malloc(sizeof(struct node));
			 //new=new->left;
			 temp->data=data1;
			 temp->left=NULL;
			 temp->right=NULL;
			 new->right=temp;
			}
		}
		}
		printf("%d root",root->data);
		traverse(root);

	}
void traverse(struct node *nodes){
	
	if(nodes!=NULL){
		traverse(nodes->left);
		traverse(nodes->right);
		printf("%d ",nodes->data);
	}
	
}
