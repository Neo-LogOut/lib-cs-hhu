typedef struct EddgeNode *PEdgeNode;
typedef struct EdgeNode *EdgeList;
struct EdgeNode{
    int endvex;
    int weight;
    PEdgeNode nextedge;
};
typedef struct {
    char vertex;
    EdgeList edgelist;
}vexNode;
typedef struct{
    int vexNum,arcNum;
    VexNode vexs[VN];
}GraphList;