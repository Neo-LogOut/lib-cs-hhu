struct BinTreeNode;
typedef struct BinTreeNode *PBinTreeNode;
struct BinTreeNode{
    DataType info;
    PBinTreeNode llink;
    PBinTreeNode rlink;
};