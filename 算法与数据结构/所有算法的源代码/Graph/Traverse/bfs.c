void bfs(Graph g,VexNode v){
    VexNode v1,v2;
    Queue q;
    q = createEmptyQueue();
    v.mark = 1;
    printf("%c",v.vertex);
    enQueue(q,v);
    while(!isEmptyQueue(q)){
        v1 = frontQueue(q);
        deQueue(q);
        v2 = firstAdjacent(g,v1);
        while(v2!=NULL){
            if(v2.mark == 0){
                v2.mark = 1;
                printf("%c",v2.vertex);
                enQueue(q,v2);
            }
            v2 = nextAdjacent(g,v1,v2);
        }
    }
}