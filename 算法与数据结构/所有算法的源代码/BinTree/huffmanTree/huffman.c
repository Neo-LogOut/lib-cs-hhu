PHtTree huffman(int m,int *w){
    PHtTree pht;
    int i,j,x1,x2,m1,m2;
    pht = (PHtTree)malloc(sizeof(struct HtTree));
    if(pht==NULL){
        printf("Out of space!\n");
        return pht;
    }
    pht->ht = (struct HtNode)malloc(sizeof)(struct HtNode)*(2*m-1);
    if(pht->ht == NULL){
        printf("Out of space!\n");
        return pht;
    }
    for(i=0;i<2*m-1;i++){
        pht->ht[i].llink = -1;
        pht->ht[i].rlink = -1;
        pht->ht[i].parent = -1;
        if(i<m){
            pht->ht[i].ww = w[i];
        }
        else{
            pht->ht[i].ww = -1;
        }
    }
    for(i=0;i<m-1;i++){
        m1 = MAXINT;
        m2 = MAXINT;
        x1 = -1;x2 = -1;
        for(j=0;j<m+i;j++){
            if(pht->ht[j].ww<m1 && pht->ht[j].parent == -1){
                m2 = m1;
                x2 = x1;
                m1 = pht->ht[j].ww;
                x1 = j;
            }
            else if(pht->ht[j].ww<m2 &&pht->ht[j].parent == -1){
                m2 =pht->ht[j].ww;
                x2 = j;
            }
        }
        pht->ht[x1].parent = m+i;
        pht->ht[x2].parent = m+i;
        pht->ht[m+i].ww = m1+m2;
        pht->ht[m+i].llink = x1;
        pht->ht[m+i].rlink = x2;
    }
    pht->root = 2*m-2;
    return pht;
}