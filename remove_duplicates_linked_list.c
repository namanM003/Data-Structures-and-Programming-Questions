/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* deleteDuplicates(struct ListNode* head) {
    if(head==NULL){
        return head;
    }
    struct ListNode *temp = head;
    struct ListNode *freeNode;
    while(temp->next!=NULL){
        if(temp->val == temp->next->val){
            freeNode = temp->next;
            temp->next = temp->next->next;
            free(freeNode);
            continue;
        }
        temp = temp->next;
    }
    return head;
}