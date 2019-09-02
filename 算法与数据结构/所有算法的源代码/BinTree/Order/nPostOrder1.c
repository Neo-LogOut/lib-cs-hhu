void nPostOrder1(BinTree t){
    Stack s;
    Elem stnode;
    BinTreeNode *p = t;
    if(t==NULL) return;
    s = createEmptyStack();
    do{
        while(p!=NULL){
            stnode.t = p;
            stnode.tag = 1;
            push(s,stnode);
            p = leftChild(p);
        }
        while(!isEmptyStack(s)){
            stnode = top(s);
            pop(s);
            p = stnode.t;
            if(stnode.tag == 1){
                stnode.tag = 2;
                push(s,stnode);
                p = rightChild(p);
                break;
            }
            else
                visit(root(p));
        }
    }while(!isEmptyStack(s));
}