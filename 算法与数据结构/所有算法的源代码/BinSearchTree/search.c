int search(PBinSearchTree ptree,KeyType key,PBinSearchNode *position){
    PBinSearchNode p,q;
    p = *ptree;
    q = p;
    while(p!=NULL){
        q = p;
        if(p->key == key){
            *position = p;
            return 1;
        }
        else if(p->key >key) p = p->llink;
        else  p = p->rlink;
    }
    *position = q;
    return 0;
}