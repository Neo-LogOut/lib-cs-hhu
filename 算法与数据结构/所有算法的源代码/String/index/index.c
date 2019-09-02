int index(PSeqString t,PSeqString p){
    int i,j;
    i = 0; j = 0;
    while(i< p->n && j< t->n){
        if(p->c[i] == t->c[j]){
            i++; j++;
        }
        else{
            j = j-i+1;
            i = 0;
        }   
    }
    if(i >= p->n) return(j- p->n +1);
    else return 0;
}