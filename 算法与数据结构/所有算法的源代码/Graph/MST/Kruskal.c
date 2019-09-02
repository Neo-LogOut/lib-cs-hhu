int kruskal(GraphMatrix *graph,Edge mst[]){
    int i,j,num = 0,start,stop;
    double minweight;
    int status[VN];
    for(i=0;i<VN;++i)
        status[i] = i;
    while(num < VN-1){
        minweight = MAX;
        for(i=0;i<VN-1;++i){
            for(j=i+1;j<VN;++j){
                if(graph->arcs[i][j] < minweight){
                    start = i;
                    stop = j;
                    minweight = graph->arcs[i][j];
                }
            }
        }
        if(minweight == MAX) return 0;
        if(status[start] != status[stop]){
            mst[num].start_vex = start;
            mst[num].stop_vex = stop;
            mst[num].weight = graph->arcs[start][stop];
            ++num;
            for(j=status[stop],i=0;i<VN;++i){
                if(status[i]==j) status[i] = status[start];
            }
        }
        graph->arcs[start][stop] = MAX;
    }
    return 1;
}