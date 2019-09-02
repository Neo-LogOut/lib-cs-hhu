void binSort(SortObject *pvector){
    int i,j,left,mid,right;
    RecordNode temp;
    RecordNode *data = pvector->record;
    for(i=1;i<pvector->n;i++){
        temp = data[i];
        left = 0;
        right = i-1;
        while(left<=right){
            mid = (left+right)/2;
            if(temp.key<data[mid].key) right = mid-1;
            else left = mid+1;
        }
        for(j=i-1;j>=left;j--)
            data[j+1] = data[j];
        if(left!=i) data[left] = temp;
    }
}