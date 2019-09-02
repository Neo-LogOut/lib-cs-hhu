int parent_seq(PSeqBinTree t,int p){
    if(p<0 || p>=t->n)
        return -1;
    return (p-1)/2;
}