struct BinSearchNode;
typedef struct BinSearchNode *PBinSearchNode;
struct BinSearchNode
{
    KeyType key;
    PBinSearchNode llink,rlink;
};
typedef struct BinSearchNode *BinSearchTree;
typedef BinSearchTree *PBinSearchTree;