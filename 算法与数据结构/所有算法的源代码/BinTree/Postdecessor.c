ThrTreeNode postdecessor(p,root){
    if(p==NULL) return NULL;
    if(p->ltag == 0) return p->leftchild;
    else if(p->rtag == 0) return p->rightchild;
    else{
        while(p->rightchild != NULL){
            p = p->rightchild;
            if(p->rtag == 0) return p->rightchild;
        }
        return NULL;
    }
} 