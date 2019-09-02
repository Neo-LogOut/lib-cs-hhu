struct Node;
typedef struct Node ListNode;
struct Node{
    KeyNode key;
    DataType info;
    ListNode *next;
};
typedef ListNode *LinkList;