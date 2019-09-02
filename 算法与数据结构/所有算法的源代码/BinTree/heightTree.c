int heightTree(BinTree t){
    while(t == NULL){
        return 0;
    }
    leftHeight = heightTree(t->llink);
    rightHeight = heightTree(t->rlink);
    return Math.max(leftHeight,rightHeight)+1;
}