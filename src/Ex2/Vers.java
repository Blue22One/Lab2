package Ex2;

class Vers {
    private String lyric;
    public Vers(String vers)
    {
        this.lyric = vers;
    }

    public int getNrCuv()
    {
        String[] cuv = lyric.split(" ");
        return cuv.length;
    }

    public int getNrVoc()
    {
        int nrVoc=0;
        for (int i=0;i<lyric.length();i++)
        {
            if(lyric.charAt(i) == 'a' || lyric.charAt(i)=='e'||lyric.charAt(i)=='i'||lyric.charAt(i)=='o'||lyric.charAt(i)=='u')
            {
                nrVoc++;
            }
        }
        return nrVoc;
    }
}
