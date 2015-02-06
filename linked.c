/*************Program to reverse a linked list***********************/
#include <stdio.h>
#include <stdarg.h>
struct node{
	int data;
	struct node *next;
};
void main()
{
	struct node *head=NULL;
	struct node *new=NULL;
	head=malloc(sizeof(struct node));
	head->data=1;
	head->next=NULL;
	int i=0;
	for(i=0;i<5;i++){
	new=head;
	while(new->next!=NULL)
		new=new->next;
	new->next=malloc(sizeof(struct node));
	new=new->next;
	int data1;
	scanf("%d",&data1);
	new->data=data1;
	}
	new=head;
	do
	{
	printf("%d\t",new->data);
	new=new->next;
	}while(new!=NULL);
	/*struct node *head2;
	head2=malloc(sizeof(struct node));
	head2->data=2;
	head2->next=NULL;
	i=0;
	for(i=0;i<2;i++){
		new=head2;
		while(new->next!=NULL)
			new=new->next;
		new->next=malloc(sizeof(struct node));
		new=new->next;
		int data2;
		scanf("%d",&data2);
		new->data=data2;
	}
	new=head2;
	do{
		printf("%d\t",new->data);
		new=new->next;
	}while(new!=NULL);
	int carry=0;
	struct node *runner;
	struct node *runner2;
	runner=head;
	runner2=head2;
	do{
		runner->data=runner->data+runner2->data;
		runner=runner->next;
		runner2=runner2->next;

	}while(runner!=NULL || runner2!=NULL);
	runner=head;
	printf("\n");
	do{
		printf("%d\t",runner->data);
		runner=runner->next;

	}while(runner!=NULL);*/

	/////////////////////////////////REVERSING THE LINKED LIST//////////////////////////////////////

	if(head==NULL){
		printf("Nothing to return\n");
		return;
	}
	if(head->next==NULL){
		printf("Nothing to reverse\n");
		return;
	}
	/*struct node *previous=malloc(sizeof(struct node));
	struct node *current=malloc(sizeof(struct node));
	struct node *next=malloc(sizeof(struct) node));
	previous==head;
	current=previous->next;

	while(previous!=NULL){
		//ne=temp->next;
		if(previous==head){
			previous->next=NULL;
		}
		else{
			if(current->next!=NULL)
				{
					next=current->next;
				}
				else{
					head=current; 
				}
			//previous=current;
			current->next=previous;
			previous=current;


		}
		temp=ne;
	}*/
		printf("\nREVERSING LINKED LIST\n");
		struct node *previous;//=malloc(sizeof(struct node));
		struct node *current;//=malloc(sizeof(struct node));
		struct node *next1;
		current=head;
		previous=NULL;
		while(current!=NULL){
			//current=current->next;
			next1=current->next;
			current->next=previous;
			previous=current;
			current=next1;
		}
		head=previous;

		struct node *temp;
		temp=head;
		while(temp!=NULL){
			printf("%d\t",temp->data);
			temp=temp->next;
		}


}

