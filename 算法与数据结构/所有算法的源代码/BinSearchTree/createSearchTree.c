int createSearchTree(PBinSearchTree ptree,SeqDictionary *dic){
    int i;
    *ptree = NULL;
    for(i=0;i<dic->n;i++){
        if(!insert(ptree,dic->element[i].key)) return 0;
    }
    return 1;
}