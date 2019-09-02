int leftChild_partree(PParTree t,int p){
    if(t->nodelist[p+1].parent == p) return(p+1);
    else return -1; 
}