void enQueue_seq(PSeqQueue paqu,DataType x){
    if((paqu->r +1)%MAXNUM == paqu->f)
        printf("Full queue.\n");
    else{
        paqu->q[paqu->r] = x;
        paqu->r = (paqu->r +1)%MAXNUM:
    }
}