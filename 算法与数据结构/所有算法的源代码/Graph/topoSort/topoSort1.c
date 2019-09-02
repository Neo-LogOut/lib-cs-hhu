int topoSort(GraphList *G,int *ptopo){
    int i,k,indegree[VN],count = 0;
    PSeqStack s = createEmptyStack_seq(VN);
    PEdgeNode p;
    findInDegree(G,indegree);
    for(i=0;i<VN;i++){
        if(indegree[i]==0) push(s,i);
    }
    while(!isEmptyStack(s)){
        i = top(s);
        ptopo[count++] = i;
        pop(s);
        p = G->vexs[i].edgelist;
        while(p!=null){
            k = p->endvex;
            indegree[k]--;
            if(indegree[k] == 0) push(s,k);
            p = p->nextedge;
        }
    }
    if(count<VN) return 0;
    else return 1;
}