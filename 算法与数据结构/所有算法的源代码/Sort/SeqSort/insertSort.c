void insertSort(SortObject *pvector){
    int i,j;
    RecordNode temp;
    RecordNode *data = pvector->record;
    for(i=1;i<prevtor->n;i++){
        temp = data[i];
        for(j=i-1;temp.key<data[j].key && j>=0;j--)
            data[i] = data[i+1];
        if(j!=i-1) data[j+1] = temp;
    }
}