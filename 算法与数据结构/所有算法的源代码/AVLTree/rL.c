PAVLNode rL(PAVLNode a,PAVLNode b){
    PAVLNode c = b->llink;
    a->rlink = c->llink;
    b->llink = c->rlink;
    c->llink = a;
    c->rlink = b;
    switch(c->bf){
        case 0: a->bf = 0; b->bf = 0; break;
        case 1: a->bf = 0; b->bf = 1; break;
        case 2: a->bf = -1; b->bf = 0; break;
    }
    c->bf = 0;
    return c;
}