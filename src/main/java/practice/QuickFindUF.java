package practice;

public class QuickFindUF {
    private Integer[] id;

    public QuickFindUF(Integer N) {
        id = new Integer[N];
        for(int i = 0; i<N ; i++)
            id[i] = i;
    }

    public boolean connected(int p, int q){
        return id[p].equals(id[q]);
    }

    public void union(int p, int q){
        int pid = id[p];
        int qid = id[q];

        for(int i=0; i<id.length; i++)
            if(id[i].equals(pid)) id[i] = qid;
    }
}
