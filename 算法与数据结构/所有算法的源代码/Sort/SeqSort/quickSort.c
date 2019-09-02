void quickSort(SortObject *pvector,int l,int r){
    int i,j;
    RecordNode temp,*data = pvector->record;
    if(l>=r) return;
    i = l;
    j = r;
    temp = data[i];
    while(i!=j){
        while(i<j && data[j].key >= temp.key)
            j--;
        if(i<j) data[i++] = data[j];
        while(i<j && data[i].key <= temp.key)
            i++;
        if(i<j) data[j--] = data[i];
    }
    data[i] = temp;
    quickSort(pvector,l,i-1);
    quickSort(pvector,i+1,r);
}