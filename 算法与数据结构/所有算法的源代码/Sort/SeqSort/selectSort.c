void selectSort(SortObject *pvector){
    int i,j,k;
    RecordNode temp,*data = pvector->record;
    for(i=0;i<pvector->n-1;i++){
        k = i;
        for(j=j+1;j<pvector->n;j++){
            if(data[j].key < data[k].key) k = j;
        }
        if(k!=i){
            temp = data[i];
            data[i] = data[k];
            data[k] = temp;+
        }
    }
}