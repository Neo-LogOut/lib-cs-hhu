void removeMin_heap(PPriorityQueue paqu){
    int s,i,child;
    DataType temp;
    if(isEmpty_heap(paqu)){
        printf("Empty!\n");
        return;
    } 
    s = --paqu->n;
    temp = paqu->pa[s];
    i = 0;
    child = 1;
    while(child<s){
        if(child<s-1 && paqu->pq[child] > paqu->pq[child+1])
            child++;
        if(temp > paqu->pq[child]){
            paqu->pq[i] = paqu->pq[child];
            i = child;
            child = 2*i+1;
        }
        else break;
    }
    paqu->pq[i] = temp;
}