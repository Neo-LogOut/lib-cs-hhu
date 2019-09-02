void findInDegree(GraphList *g,int *indegree){
    int i;
    Edgelist p;
    for(i=0;i<VN;i++) indegree[i] = 0;
    for(i=0;i<VN;i++){
        p = g->vexs[i].edgelist;
        while(p){
            ++indegree[p->endvex];
            p = p->nextedge;
        }
    }
}