PAVLNode lR(PAVLNode a,PAVLNode b){
    PAVLNode c = b->rlink;
    a->llink = c->rlink;
    b->rlink = v->llink;
    c->llink = b;
    c->rlink = a;
    switch(c->bf){
        case 0: a->bf = 0; b->bf = 0; break;
        case 1: a->bf = 1; b->bf = 0; break;
        case 2: a->bf = 0; b->bf = -1; break;
    }
    c->bf = 0;
    return c;
}