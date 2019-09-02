DataType frontQueue_seq(PSeqQueue paqu){
    if(paqu->f == paqu->r)
        printf("Empty Queue.\n");
    else
        return(paqu->q[paqu->f]);
}