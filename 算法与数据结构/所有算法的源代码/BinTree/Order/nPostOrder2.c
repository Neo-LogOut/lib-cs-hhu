void nPostOrder2(BinTree t){
    Stack s = createEmptyStack();
    BinTree p = t;
    while(p!=NULL || !isEmptyStack(s)){
        while(p!=NULL){
            push(s,p);
            p = leftChild(p)?leftChild(p);rightChild(p);
        }
        p = top(s);
        pop(s);
        visit(root(p));
        if(!isEmptyStack(s) && leftChild(top(s)) == p)
            p = rightChild(top(s));
        else
            p = NULL;
    }
}