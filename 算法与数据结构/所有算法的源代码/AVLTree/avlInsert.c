int avlInsert(PAVLTree ptree,KeyType key){
    PAVLNode node_a,node_b,parent_a,p,q,node;
    int d;
    if(*ptree==NULL){
        *ptree = createNode(key);
        return 1;
    }
    node_a = p = *ptree;
    parent_a = q = NULL;
    while(p!=NULL){
        if(key == p->key)return 1;
        if(p->bf!=0){
            parent_a = q;
            node_a = p;
        }
        q = p;
        if(key < p->key) p = p->llink;
        else p = p->rlink;
    }
    node = createNode(key);
    if(key < q->key) q->llink = node;
    else q->rlink = node;
    if(key < node_a->key){
        p = node_b = node_a->llink;
        d = -1;
    }
    else{
        p = node_b = node_a->rlink;
        d = 1;
    }
    while(p!=node){
        if(key < p->key){
            p->bf = -1;
            p = p->llink;
        }
        else{
            p->bf = 1;
            p = p->rlink;
        }
    }
    if(node_a->bf == 0){
        node_a->bf = d;
        return 1;
    }
    if(node_a->bf == -d){
        node_a->bf = 0;
        return 1;
    }
    if(d==-1){
        if(node_b->bf == -1) node_b = lL(node_a,node_b);
        else node_b = lR(node_a,node_b);
    }
    else{
        if(node_b->bf == 1)node_b = rR(node_a,node_b);
        else node_b = rL(node_a,node_b);
    }
    if(parent_a == NULL) *ptree = node_b;
    else{
        if(parent_a->llink == node_a) parent_a->llink = node_b;
        else parent_a->rlink = node_b;
    }
}