int createDN(GraphMatrix *G){
    int i,j,k,weight;
    VexType v1,v2;  //顶点变量
    printf("Input vexNum,arcNum");
    scanf("%d,%d",&G->vexNum,&G->arcNum);   //输入顶点和边数
    for(i=0;i<G->vexNum;i++){   //初始化邻接矩阵
        for(j=0;j<G->vexNum;j++){
            if(i==j) G->arcs[i][j] = 0;
            else G->arcs[i][j] = 1000;
        }
    }
    printf("Input vertexes\n");
    for(i=0;i<G->vexNum;i++)    //输入顶点表
        scanf("%c",&G->vexs[i]);
    printf("Input edges: v1,v2,weight\n");  //输入边
    for(i=0;i<G->arcNum;i++){
        scanf("%c,%c,%d",&v1,&v2,&weight);
        j = searchVertex(G,v1);
        k = searchVertex(G,v2);
        G->arcs[j][k] = weight;
    }
    return 1;
}