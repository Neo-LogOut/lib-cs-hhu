#include<stdio.h>
#define VN 10
#define MAX 1000
typedef char VexType;
typedef int AdjType;
typedef struct{
    int vexNum;arcNum;
    VexType vexs[VN];
    AdjType arcs[VN][VN]
}GraphMatrix;

//查找顶点x的下标，返回x在顶点表中的下标
int searchVertex(GraphMatrix *graph,VexType x){
    int k;
    for(k=0;k<graph->arcNum;k++){
        if(graph->vexs[k] = x){
            return k;
        }
    }
    return -1;
}

//邻接矩阵创建有向图
int createDN(GraphMatrix *graph){
    int i,j,k,weight;
    char v1,v2;
    printf("输入顶点数和边数:");
    scanf("%d %d",&graph->vexNum,&graph->arcNum);
    for(i=0;i<graph->vexNum;i++){
        for(j=0;j<graph->vexNum;j++){
            if(i==j) graph->arcs[i][j] = 0;
            else graph->arcs[i][j] = MAX; 
        }
    }
    printf("输入顶点信息：");
    for(i=0;i<graph->vexNum;i++) scanf("%c",&graph->vexs[i]);
    printf("输入边信息：");
    for(i=0;i<graph->arcNum;i++){
        scanf("%c %c %d",&v1,&v2,&weight);
        j = searchVertex(graph,v1);
        k = searchVertex(graph,v2);
        graph->arcs[j][k] = weight;
    }
    return 1;
}

//判断两个顶点vi，vj是否邻接
int isAdjacent(GraphMatrix *graph,VexType vi,VexType vj){
    int i,j;
    i = searchVertex(graph,vi);
    j = searchVertex(graph,vj);
    if(graph->arcs[i][j] != MAX) return 0;
    return -1;
}

//求顶点vi的入度（出度同理）
int InIndegree(GraphMatrix *graph,VexType vi){
    int i,j,degree = 0;
    i = searchVertex(graph,vi);
    for(j=0;j<graph->vexNum;j++){
        if(graph->arcs[j][i] != MAX) degree++; 
    }
    return degree;
}

//取图中第一个顶点信息
VexType firstVerTex(GraphMatrix *graph){
    return graph->vexs[0];
}

//取vi的下一个顶点信息
VexType nextVertex(GraphMatrix *graph,VexType vi){
    int i;
    i = searchVertex(graph,vi);
    return graph->vexs[i+1];
}

//求顶点vi的第一个邻接顶点
VexType firstAdjacent(GraphMatrix *graph,VexType vi){
    int i,j;
    i = searchVertex(graph,vi);
    for(j=0;j<graph->arcNum;j++){
        if(graph->arcs[i][j] != MAX && i!=j) return graph->vexs[j];
    }
    return NULL;
}

//求vi的、在vj之后的邻接点
VexType nextAdjacent(GraphMatrix *graph,VexType vi,VexType vj){
    int i,j,k;
    i = searchVertex(graph,vi);
    j = searchVertex(graph,vj);
    for(k=j+1;k<graph->vexNum;k++){
        if(graph->arcs[i][k] != MAX && i!=j) return graph->vexs[k];
    }
    return NULL;
}