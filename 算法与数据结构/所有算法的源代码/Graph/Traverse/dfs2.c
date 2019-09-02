void dfs(Graph g,VexNode v){
    VexNode w;
    Stack st;
    int m = g.vexNum;
    st = createEmptyStack(m);
    printf("start vertex %c",v.vertex);
    v.mark = 1;
    push(v,st);
    w = firstAdjacent(g,v);
    while(!isEmptyStack(st)){
        if(w!=NULL){
            if(w.mark == 1)
                w = nextAdjacent(g,top(st),w);
            else{
                printf("%c",w.vertex);
                w.mark = 1;
                push(w,st);
                w = firstAdjacent(g,w);
            }
        }
        else{
            w = top(st);
            pop(st);
        }
    }
}