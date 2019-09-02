void dfs(Graph g,VexNode v){
    VexNode v1;
    printf("%c",v.vertex);
    v.mark = 1;
    v1 = firstAdjacent(g,v);
    while(v1){
        if(v1.mark == 0) dfs(g,v1);
        v1 = nextAdjacent(g,v,v1);
    }
}