struct AVLNode;
typedef struct AVLNode *PAVLNode;
struct AVLNode{
    KeyType key;
    int bf;
    PAVLNode llink,rlink;
};
typedef struct AVLNode *AVLTree;
typedef AVLTree *PAVLTree;