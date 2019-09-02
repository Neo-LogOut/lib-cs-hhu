void dijkstra(GraphMatrix *graph,Path dist[]){
    int i,j,min;
    float minw;
    init(graph,dist);
    for(i=1;i<VN;i++){
        minw = Max;
        min = 0;
        for(j=1;j<VN;j++){
            if(graph->arcs[j][j] == 0 && dist[j].length <minw){
                minw = dist[j].length;
                min = j;
            }
        }
        if(min == 0) break;
        graph->arcs[min][min] = 1;
        for(j=1;j<VN;j++){
            if(graph->arcs[j][j] == 0 && dist[j].length > dist[min].length + graph->arcs[min][j]){
                dist[j].length = dist[min].length + graph->arcs[min][j];
                dist[j].prevex = min;
            }
        }
    }
}