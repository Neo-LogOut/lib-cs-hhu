void bubbleSort(SortObject *pvector){
    int i,j,noswap;
    RecordNode temp,*data =pvector->record;
    for(i=0;i<pvector->n;i++){
        noswap = TRUE;
        for(j=0;j<pvector->n-i-1;j++){
            if(data[j+1].key < data[j].key){
                temp = data[j];
                data[j] = data[j+1];
                data[j+1] = temp;
                noswap = FALSE;
            }
        }
        if(noswap) break;
    }
}