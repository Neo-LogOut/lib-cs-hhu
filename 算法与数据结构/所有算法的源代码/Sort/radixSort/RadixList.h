typedef struct Node *PNode;
struct Node{
    KeyType key[D];
    DataType info;
    PNode next;
};
typedef struct{
    PNode f;
    PNode e;
}Queue;
typedef struct Node *radixList;