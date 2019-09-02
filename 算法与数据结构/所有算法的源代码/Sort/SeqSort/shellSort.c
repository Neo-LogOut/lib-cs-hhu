void shellSort(SortObject *pvector,int d){
    int i,j,inc;
    RecordNode temp;
    *data = pvector->record;
    for(inc=d;inc>0;inc/=2){
        for(i=inc;i<pvector->n;i++){
            temp = data[i];
            for(j=i-inc;j>=0 && temp.key<data[j].key;j-=inc)
                data[j+inc] = data[j];
            data[j+inc] = temp;
        }
    }
}