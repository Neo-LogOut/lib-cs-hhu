//求中序线索二叉树中某结点在后序列表中的前驱
ThrTreeNode predecessor(p,root){
    if(p==NULL) return NULL;
    if(p->rtag == 0) return p->rightchild;
    else if(p->ltag == 0) return p->leftchild;
    else{
        while(p->leftchild != NULL){
            p = p->leftchild;
            if(p->ltag == 0) return p->leftchild;
        }
        return NULL;
    }
}