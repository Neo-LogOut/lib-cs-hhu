int rightSibling_partree(PParTree t,int p){
    int i;
    if(p>=0 && p<t->n)          
        for(i=p+1;i<t->n;i++)
            if(t->nodelist[i].parent == t->nodelist[p].parent) 
                return(i);
    return -1;
}