void prim(GraphMatrix *pgraph,Edge mst[]){
    int i,j,min,vx,vy;
    double weight;
    Edge edge;
    for(i=0;i<VN-1;i++){    //初始化
        mst[i].start_vex = 0;
        mst[i].stop_vex = i+1;
        mst[i].weight  = pgraph->arcs[0][i+1];
    }
    for(i=0;i<VN-1;i++){
        weight = Max;
        min = i;
        for(j=i;j<VN-1;j++){
            if(mst[j].weight < weight){ //若更小，则替换
                weight = mst[j].weight;
                min = j;
            }
        }
        if(min!=i){
            edge = mst[min];
            mst[min] = mst[i];
            mst[i] = edge;
        }
        vx = mst[i].stop_vex;   //vx是进入U的新顶点
        for(j=i+1;j<VN-1;j++){  //考察vx是否能修改
            vy = mst[j].stop_vex;
            weight = pgraph->arcs[vx][vy];
            if(weight < mst[j].weight){
                mst[j].weight = weight;
                mst[j].start_vex = vx;
            }
        }
    }
}