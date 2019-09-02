int leftChild_seq(PSeqBinTree t,int p){
    if(p<0 || p>=t->n)
        return -1;
    return 2*p+1;
}