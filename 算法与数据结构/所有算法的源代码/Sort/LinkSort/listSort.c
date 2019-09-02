void listSort(LinkList *plist){
    ListNode *now,*pre,*p,*q,*head;
    head = *plist;
    pre = head->next;
    if(pre==NULL) return;
    now = pre->next;
    if(now==NULL) return;
    while(now!=NULL){
        q = head;
        p = head->next;
        while(p!=now && p->key <= now->key){
            q = p;
            p = p->next;
        }
        if(p==now){
            pre = pre->next;
            now = pre->next;
            continue;
        }
        pre->next = now->next;
        q->next = now;
        now->next = p;
        now = pre->next;
    }
}