typedef char VexType;
typedef float AdjType;
typedef struct{
    int vexNum,arcNum;  //顶点数，边数
    VexType vexs[vn];   //存储顶点信息
    AdjType arcs[vn][vn];   //存储边信息
}GraphMatrix;