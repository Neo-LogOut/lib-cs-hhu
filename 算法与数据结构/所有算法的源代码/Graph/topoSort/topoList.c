int topoList(GraphList *pAov,int *ptopo,int *indegree,int top){
    Edgelist p;
    int i,k,count = 0;
    while(top != -1){
        i = top;
        top = indegree[i];
        ptopo[count++] = i;
        for(p = pAov->vexs[i].edgelist;p!=NULL;p = p->nextedge){
            k = p->endvex;
            
            if(--indegree[k] == 0){
                indegree[k] = top;
                top = k;
            }
        }
    }
    return count;
}