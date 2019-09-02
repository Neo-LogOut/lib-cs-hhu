int rightSibling_chitree(PChiTree t;int p ){
    int i;
    struct EdgeNode *v;
    for(i=0;i<t->n;i++){
        v = t->nodelist[i].children;
        while(v!=NULL){
            if(v->nodeposition == p){
                if(v->link == NULL) return null;
                else return (v->link->nodeposition);
            }
            else v= v->link;
        }
    }
    return -1;
}