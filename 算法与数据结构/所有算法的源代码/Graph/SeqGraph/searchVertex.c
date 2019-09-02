int searchVertex(GraphMatrix *G,VexType x){
    int k,j = -1;
    for(k=0;k<G->vexNum;k++){
        if(G->vexs[k] == x){
            j = k;
            break;
        }
    }
    return j;
}