void heapSort(SortObject *pvector){
    int i,n;
    RecordNode temp;
    n = pvector->n;
    for(i=n/2-1;i>=0;i--) sift(pvector,n,i);
    for(i=n-1;i>0;i--){
        temp = pvector->record[0];
        pvector->record[0] = pvector->record[i];
        pvector->record[i] = temp;
        sift(pvector,i,0);
    }
}

void sift(SortObject *pvector,int size,int p){
    RecordNode temp = pvector->record[p];
    int child = 2*p+1;
    while(child<size){
        if((child<size-1) && (pvector->record[child].key < pvector->record[child+1].key))
            child++;
        if(temp.key < pvector->record[child].key){
            pvector->record[p] = pvector->record[child];
            p = child;
            child = 2*p+1;
        }
        else break;
    }
    pvector->record[p] = temp;
}