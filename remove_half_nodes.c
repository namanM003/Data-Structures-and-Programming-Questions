#include <stdio.h>
#include <conio.h>
struct Node{
	int x;
	struct Node *left,*right;
};
void main(){
	Node head = NULL;
	Node temp;
	int no_of_nodes;
	int loop;
	printf("Enter No of Nodes\n");
	scanf("%d",&no_of_nodes);
	for(loop=0;loop<no_of_nodes;loop++){
		if(head == NULL){
			scanf("%d",&head->x);
			head->left=NULL;
			head->right=NULL;
		}
		else{
			temp = head;
			while(temp->next!=NULL){
				temp=temp->next;
			}
			Node new;
			scanf("%d")

		}
	}
}
