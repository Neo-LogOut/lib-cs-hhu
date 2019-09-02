Datatype deleteMin(PriorityQueue pq1){
    DataType result;
    result = min(pq1);
    removeMin(pq1);
    return result;
}