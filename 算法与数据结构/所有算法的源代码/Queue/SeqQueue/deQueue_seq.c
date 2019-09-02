void deQueue_seq(PSeqQueue paqu){
    if(paqu->f == paqu->r)
        printf("Empty Queue.\n");
    else
        paqu->f = (paqu->f +1)%MAXNUM;
}