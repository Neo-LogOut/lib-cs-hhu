PAVLNode rR(PAVLNode a,PAVLNode b){
    a->bf = 0;
    a->rlink = b->llink;
    b->bf = 0;
    b->llink = a;
    return b;
}