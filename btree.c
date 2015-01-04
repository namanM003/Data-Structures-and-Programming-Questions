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
	/*struct node *runner=nodes;
	printf("%d check\n",runner->data);
	if(runner->left==NULL){
		printf("%d",runner->data);
		printf("\nprinting left\n");
	}
	else{
	runner=runner->left;
	printf("Called traverse left");
	traverse(runner);
	}
	printf("%d",runner->data);
	printf("\nprinting root\n");
	if(runner->right==NULL){
	printf("%d",runner->data);
	printf("\nprinting right\n");
	}
	else{
	runner=runner->right;
	printf("Called traverse right");
	traverse(runner);*/
	if (nodes->left != NULL){
        traverse (nodes->left);
    }
    printf("%d\t", nodes->data);
    if (nodes->right != NULL){
        traverse (nodes->right);
    }
	
}
