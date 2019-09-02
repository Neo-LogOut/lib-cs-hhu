int topoSort(GraphList *pAov,int *ptopo){
    int i,count = 0,top = -1;
    int indegree[VN];
    findInDegree(G,indegree);
    for(i=0;i<VN;i++){
        if(indegree[i] == 0){
            indegree[i] = top;
            top = i;
        }
    }
    count = topoList(pAov,ptopo,indegree,top);
    if(count < VN) return 0;
    return 1; 
}