#include<stdio.h>
#define VN 10
#define MAX 1000

typedef char VexType;
typedef int AdjType;

struct EdgeNode;
typedef struct EdgeNode *PEdgeNode;
typedef struct EdgeNode *EdgeList;
struct EdgeNode{    //边表中结点结构
    int endvex; //相邻顶点在顶点表中下标
    AdjType weight; 
    PEdgeNode nextedge; //边表中下一节点
};
typedef struct{ //顶点信息
    VexType vertex; 
    EdgeList edgelist;  //边表头指针
}VexNode;
typedef struct{ //顶点表
    VexNode vexs[VN];  
    int vexNum,arcNum;
}GraphList;

//找vi在顶点表中下标（为后来的算法做准备）
int searchVertex(GraphList *graph,VexType vi){
    int i;
    for(i=0;i<graph->vexNum;i++){
        if(graph->vexs[i].vertex == vi) return i; 
    }
    return -1;
}

//判断两个顶点vi,vj是否邻接
int isAdjacent(GraphList *graph,VexType vi,VexType vj){
    int i,j;
    i = searchVertex(graph,vi);
    j = searchVertex(graph,vj);
    PEdgeNode p = graph->vexs[i].edgelist;
    while(p!=NULL){
        if(p->endvex == j ) return 0;
        p = p->nextedge;
    }
    return -1;
}

//求顶点的度
int degree(GraphList *graph,VexType vi){
    int i,degree = 0;
    i = searchVertex(graph,vi);
    PEdgeNode p = graph->vexs[i].edgelist;
    while(p!=NULL){
        degree++;
        p = p->nextedge;
    }
    return degree;
}

//取图中的第一个顶点信息
VexType firstVertex(GraphList *graph){
    return graph->vexs[0].vertex;
}

//取vi的下一个顶点信息
VexType nextVertex(GraphList *graph,VexType vi){
    int i;
    i = searchVertex(graph,vi);
    return graph->vexs[i++].vertex;
}

//求vi的第一个邻接顶点
VexType firstAdjacent(GraphList *graph,VexType vi){
    int i,j;
    i = searchVertex(graph,vi);
    PEdgeNode p = graph->vexs[i].edgelist;
    j = p->endvex;
    return graph->vexs[j].vertex;
}

//求在vi的、在vj之后的邻接点
VexType nextAdjacent(GraphList *graph,VexType vi,VexType vj){
    int i,j,k;
    i = searchVertex(graph,vi);
    j = searchVertex(graph,vj);
    PEdgeNode p = graph->vexs[i].edgelist;
    while(p!=NULL){
        if(p->endvex == j){
            k = p->nextedge->endvex;
            return graph->vexs[k].vertex;
        }
        p = p->nextedge;
    }
    return NULL;
}
