void init(GraphMatrix *pgraph,Path dist[]){
    int i;
    dist[0].length = 0;
    dist[0].prevex = 0;
    pgraph->arcs[0][0] = 1;
    for(i=1;i<VN;i++){
        dist[i].length = pgraph->arcs[0][i];
        if(dist[i].length != Max)
            dist[i].prevex = 0;
        else dist[i].prevex = -1;
    }
}