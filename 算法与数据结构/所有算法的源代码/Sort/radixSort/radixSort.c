void radixSort(RadixList *plist,int d,int r){
    int i,j,k,PNode p,head = (*plist)->next;
    Queue queue[r];
    for(j=d-1;j>=0;j--){
        for(i=0;i<r;i++) queue[i].f = queue[i].e = NULL;
        for(p = head;p!=NULL;p = p->next){
            k = p->key[j];
            if(queue[k].f == NULL) queue[k].f = p;
            else (queue[k].e)->next = p;
            queue[k].e = p;
        }
        for(i=0;queue[i].f == NULL;i++);
        p = queue[i].e;
        head  = queue[i].f;
        for(i++;i<r;i++)
            if(queue[i].f != NULL){
                p->next = queue[i].f;
                p = queue[i].e;
            }
        p->next = NULL;
    }
    (*plist)->next = head;
}