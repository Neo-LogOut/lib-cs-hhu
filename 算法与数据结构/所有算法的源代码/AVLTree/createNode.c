PAVLNode createNode(KeyType key){
    PAVLNode node = (PAVLNode)malloc(sizeof(AVLNode));
    if(node!=NULL){
        node->key = key;
        node->bf = 0;
        node->llink = node->rlink = NULL;
    }
    return node;
}