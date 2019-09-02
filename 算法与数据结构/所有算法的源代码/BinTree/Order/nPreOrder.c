void nPreOrder(BinTree t){
    Stack s;
    BinTreeNode *c;
    if(t==NULL) return;
    s = createEmptyStack();
    push(s,t);
    while(!isEmptyStack(s)){
        c = top(s);
        pop(s);
        if(c!=NULL){
            visit(root(c));
            push(s,rightChild(c));
            push(s,leftChild(c));
        }
    }
}