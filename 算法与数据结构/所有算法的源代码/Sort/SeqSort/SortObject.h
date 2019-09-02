typedef int KeyType;
typedef int DataType;
typedef struct{
    KeyType key;
    DataType info;
}RecordNode;
typedef struct{
    int n;
    RecordNode *record;
}SortObject;
