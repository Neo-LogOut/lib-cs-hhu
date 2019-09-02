struct BinSearchNode;
typedef struct BinSearchNode *PBinSearchNode;
struct BinSearchNode{
    keyType key;
    PBinSearchNode llink,rlink;
};
typedef struct BinSearchNode *BinSearchTree;
typedef BinSearchTree *PBinSearchNode;