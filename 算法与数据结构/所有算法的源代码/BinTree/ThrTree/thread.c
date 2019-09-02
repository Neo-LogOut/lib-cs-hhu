void thread(ThrTree t){
    PSeqStack st = createEmptyStack(M);
    ThrTree p,pr;
    if(t == NULL)return;
    p = t;
    pr = NULL;
    do
    {
        while(p!=NULL){
            push_seq(st,p);
            p = p->llink;
        }
        p = top_seq(st);
        pop_seq(st);
        if(pr!=NULL){
            if(pr->rlink == NULL){
                pr->rlink = p;
                pr->rtag = 1;
            }
            if(p->llink == NULL){
                p->llink = pr;
                p->ltag =1;
            }
            pr = p;
            p = p->rlink;
        }
    } while (!isEmptyStack_seq(st) || p!=NULL);
    
}