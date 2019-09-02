void add_heap(PPriorityQueue paqu,DataType x){
    int i;
    if(paqu->n >= paqu->MAXNUM){
        printf("Full!\n");
        return;
    }
    for(i=paqu->n;i>0 && paqu->pq[(i-1/2)] > x;i=(i-1)/2){
        paqu->pq[i] = paqu->paqu->pq[(i-1)/2];
    }
    paqu->pq[i] = x;
    paqu->n++;
}