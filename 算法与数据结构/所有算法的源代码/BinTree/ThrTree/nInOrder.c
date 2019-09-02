void nInOrder(ThrTree t){
    ThrTree p = t;
    if(t == NULL) return;
    while(p->llink != NULL && p->ltag == 0) p = p->llink;
    while(p != NULL){
        visit(*p);
        if(p->rlink != NULL && p->rtag == 0){
            p = p->rlink;
            while(p->llink != NULL && p->ltag == 0) p = p->llink;    
        }
        else p = p->rlink;
    }
}