void nInOrder(BinTree t){
    Stack s = createEmptyStack();
    BinTree c = t;
    if(c == NULL)return;
    do{
        while(c!=NULL){
            push(s,c);
            c = leftChild(c);
        }
        c = top(s);
        pop(s);
        visit(root(c));
        c = rightChild(c);
    }while(c!=NULL || !isEmptyStack(s));
}