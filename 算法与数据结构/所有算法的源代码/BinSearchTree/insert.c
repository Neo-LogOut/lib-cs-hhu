int insert(PBinSearchTree ptree,KeyType key){
    PBinSearchNode p,position;
    if(search(ptree,key,&position) == 1) return 1;
    p = (PBinSearchTree)malloc(sizeof(struct BinSearchTree));
    if(p==NULL){
        printf("Error\n");
        return 0;
    }
    p->key = key;
    p->llink = p->rlink = NULL;
    if(position == NULL) *ptree = p;
    else if(key<position->key) position->llink = p;
    else position->rlink = p;
    return 1;
}