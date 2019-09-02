PAVLNode lL(PAVLNode a,PAVLnode b){
    a->bf = 0;
    a->llink = b->rlink;
    b->bf = 0;
    b->rlink = a;
    return b;
}