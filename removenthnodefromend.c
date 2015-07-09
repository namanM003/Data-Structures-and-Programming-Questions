/**Remove Nth Node From End of List
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeNthFromEnd(struct ListNode* head, int n) {
    struct ListNode *nthRunner,*deletenodes,*previous;
    if(head == NULL){
        return head;
    }
    nthRunner = head;
    deletenodes = head;
    previous = NULL;
    int i = 0;
    //int count=0;
    for(i=1;i<n;i++){
        
        if(nthRunner->next!=NULL){
            nthRunner = nthRunner->next;
        }
        else{
            return head;
        }
    }
    
    while(nthRunner->next!=NULL){
        nthRunner = nthRunner->next;
        previous = deletenodes;
        deletenodes = deletenodes->next;
    }
    //nthRunner = deletenodes;
        if(previous!=NULL)    
            previous->next  = deletenodes->next;
        else
            head = head->next;
    
    //free(nthRunner);
    return head;
}